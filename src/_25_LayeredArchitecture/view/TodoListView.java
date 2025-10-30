package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principal;
    private UserService userService;
    private TodoService todoService;

    public TodoListView(UserService userService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
    }

    public void homeView() {
        while (true) {
            System.out.println("[ TodoList ]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">>>");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) break;
            else if ("1".equals(cmd)) {
                todoListMenuView();
                // TodoList 관리
                if (principal == null) System.out.println("로그인 후 사용 가능합니다.");
            } else if ("2".equals(cmd) && principal == null) {
                // 회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                // 로그아웃
                principal = null;
                System.out.println("로그아웃 되었습니다.");
            } else if ("3".equals(cmd) && principal == null) {
                // 로그인
                signinView();
            } else System.out.println("잘못입력하였습니다.");
        }
    }

    // 회원가입 뷰
    public void signupView() {
        System.out.println("[ 회원가입 ]");
        String username;
        String password;
        while (true) {
            // 중복확인
            System.out.print("username : ");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) {
                System.out.println("사용 가능한 username입니다.");
                break; // 중복이 되지 않았을 때
            }
            System.out.println("이미 존재하는 username입니다.");
        }
        while (true) {
            System.out.print("password : ");
            password = scanner.nextLine();
            if (!userService.isDuplicatedPassword(password)) {
                System.out.println("사용 가능한 password입니다.");
                break; // 중복이 되지 않았을 때
            }
            System.out.println("이미 존재하는 password입니다.");
        }
        System.out.println("name : ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
        // UserService의 회원가입 로직에 signupReqDto 전달
        userService.signup(signupReqDto);
        System.out.println("회원가입 완료");
        userService.printAllUserList();
        // 조회할 수 있는 로직
    }
    // 로그인 뷰
    public void signinView() {
        System.out.println("[ 로그인 ]");
        String username;
        String password;
        System.out.print("username 입력 : ");
        username = scanner.nextLine();
        System.out.println("password 입력 : ");
        password = scanner.nextLine();
        SigninReqDto signinReqDto = new SigninReqDto(username, password);
        User foundUser = userService.signin(signinReqDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인해주세요.");
        }
        principal = foundUser;
        System.out.println("로그인 성공");
    }

    public void todoListMenuView() {
        while (true) {
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">>> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) break;
            else if ("1".equals(cmd))
            {
                System.out.println("[ Todo 등록 ]");
                todoUp();
            }
            // LocalDateRime.now()
            else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoPrint();
            }
            else System.out.println("잘못입력하였습니다.");
        }
    }
    public void todoUp() {
        String contents = scanner.nextLine();
        TodoRegisterReqDto todoRegisterReqDto = new TodoRegisterReqDto(contents, principal);
        todoService.todoUp(todoRegisterReqDto);
    }
    public void todoPrint() {
        todoService.printAllTodoList();
    }
}
