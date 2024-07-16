package person;

public class Animal {
    private String name;//Thuộc tính thường sử dụng với từ khóa private
    //Muốn lấy dữ liệu thì thông qua phương thức là getter và setter
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
