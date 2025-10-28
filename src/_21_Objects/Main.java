package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("박윤호", "국비");
        Teacher teacher2 = new Teacher("박윤호", "국비");
        System.out.println(teacher1);
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
    }
}
