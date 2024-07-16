package BaiTap;

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(2.5);
        Circle[] circles = {c1, c2, c3};
        System.out.println("Số lượng hình tròn đã tạo: " + Circle.getCount());
        System.out.println("Tổng diện tích các hình tròn: " + Circle.getTotalArea(circles));
        System.out.println("Hình tròn có bán kính lớn nhất: " + Circle.getMaxRadius(circles));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
