package main;

import person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chinh", 1);
        System.out.println(person.name);
        //System.out.println(person.id);
        System.out.println(person.go());
        //System.out.println(person.money); //Lỗi : vì main khác package với person và không có quan hệ kế thừa person
    }
}
