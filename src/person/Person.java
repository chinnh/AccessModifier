package person;/*
Tính đóng gói : là kỹ thuật che giấu dữ liệu chỉ cho phép truy cập thông tin cần thiết
Access Modifier : là các từ khóa quy định phạm vi truy cập của thuộc tính và phương thức ở trong class
public, private, default, protected
Từ khóa public : cho phép dữ liệu truy cập ở bất cứ nơi nào
Từ khóa private : cho phép dữ liệu truy cập trong cùng 1 lớp
Từ khóa default : khi không sử dụng access modifier nào thì default sẽ được áp dụng và cho phép dữ liệu truy cập trong cùng 1 package
Từ khóa protected : cho phép khi trong mối quan hệ kế thừa và trong packagep
 */

public class Person {
    public String name;
    private int id;
    int age;
    protected double money;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String go() {
        return this.name + " is go" ;
    }
    private void eat(){
        System.out.println(this.id);
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
    public static void main(String[] args) {
        Person p = new Person("John", 1);
        System.out.println(p.id);
        p.eat();
        System.out.println(p.age);
    }
}
