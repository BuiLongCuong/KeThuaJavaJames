package Bai3;

public class Main2 {
    public static void main(String[] args) {
        Triangle a = new Triangle("blue",3,4,5);
        System.out.println(a);
        System.out.println("Diện tích của tam giác: "+a.getArea());
        System.out.println("Chu vi của tam giác: "+a.getPerimeter());
    }
}
