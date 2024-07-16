package person;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Hi", 9);
        System.out.println(person.age);
        person.sleep();
        System.out.println(person.money);
    }
}
