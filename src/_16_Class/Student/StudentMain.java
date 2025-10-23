package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("a", 1, "a", "a");
        student1.setName("vvv");
        student1.showInfo();
        System.out.println(student1.getName());
    }
}
