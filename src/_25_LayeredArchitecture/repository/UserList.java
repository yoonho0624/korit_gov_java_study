package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }
    public User[] getAllUser() {
        return users;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }
    public User findByPassword(String password) {
        for (User user : users) {
            if (user.getPassword().equals(password)) return user;
        }
        return null;
    }
    public int generateUserId() {
        // 만약 users 배열에 아무것도 없으면 1반환
        // 있으면 마지막 user객체의 userId에 + 1한 결과값을 반환
        /*if (users == null) return 1;
        else {
            return users[users.length - 1].getUserId() + 1;
        }*/
        return users.length == 0 ? 1 : users[users.length - 1].getUserId() + 1;
    }
    public void add(User user) {
        // 새로 넣을 배열 => 원래 있던 배열의 길이에서 + 1
        // 새로 넣을 배열에 원래 있던 요소들을 먼저 추가
        // 새로 추가할 user를 넣어야함
        // users에 있던 배열에서 새로운 배열로 바꾸기
        User[] a = new User[users.length + 1];
        for (User user1 : users) {
            a = users;
        }
        a[users.length] = new User(generateUserId(), user.getUsername(), user.getPassword(), user.getName());
        users = a;
    }
}
