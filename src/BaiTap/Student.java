package BaiTap;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Xin chào";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Chào các bạn";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
