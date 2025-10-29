package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.Builder.builder()
                .name("박윤호")
                .age(25)
                .email("dbdgh0624@naver.com")
                .build();

    }
}
