package BaiTap;

public class StudentMain {
    public static void main(String args[]) {
        Student.change();
        Student s1 = new Student(1, "Nguyễn");
        Student s2 = new Student(2, "Hữu");
        Student s3 = new Student(3, "Chinh");
        s1.display();
        s2.display();
        s3.display();
    }
}
