package _25_LayeredArchitecture;

import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.repository.UserList;
import _25_LayeredArchitecture.service.UserService;
import _25_LayeredArchitecture.view.TodoListView;

import java.time.LocalDateTime;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoListView todoListView = new TodoListView(userService);
        //todoListView.homeView();
        System.out.println(LocalDateTime.now());
        todoListView.todoListMenuView();
    }
}
