package BaiTap;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", "Ngựa");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Lamborghini", "Bò");
        System.out.println(Car.numberOfCars);
    }
}
