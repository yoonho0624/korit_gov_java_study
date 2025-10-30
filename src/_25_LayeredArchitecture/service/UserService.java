package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }
    // username 중복확인
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }
    // password 중복확인
    public boolean isDuplicatedPassword(String password) {
        return userList.findByPassword(password) != null;
    }
    public void signup(SignupReqDto signupReqDto) {
        // 1. signupReqDto -> user(entity)
        User user = signupReqDto.toEntity();
        // 2. userId 생성
        user.setUserId(userList.generateUserId());
        // 3. user 배열에 추가
        userList.add(user);
    }

    // 회원정보 전체 출력
    public void printAllUserList() {
        System.out.println("[[ 회원정보 전체 조회 ]]");
        for (User user : userList.getAllUser()) System.out.println(user);
    }

    public User signin(SigninReqDto signinReqDto) {
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        // username을 가진 회원 없음
        if (foundUser == null) return null;
        // 비밀번호가 일치하지 않음
        if (!foundUser.getPassword().equals(signinReqDto.getPassword())) return null;
        return foundUser;
    }

}
