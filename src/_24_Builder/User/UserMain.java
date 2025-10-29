package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .userId(1)
                .email("S")
                .password("123")
                .username("sd")
                .build();
        System.out.println(user);
    }
}
