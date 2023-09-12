package Bai1;

public class Circle {
    private double radius;
    private String color;
    public final double PI=3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double tinhDientich(){
        double S = PI*radius*radius;
//       System.out.println("Diện tích hình tròn: "+ S);
        return S;
    }
//    public void showInfoCircle(){
//        System.out.println("Radius: "+ radius+", Color: "+color+", Diện tích hình tròn: "+tinhDientich());
//    }

    @Override
    public String toString() {
        return "Radius: " +radius+ ", Color: "+color+", Diện tích hình tròn: "+ tinhDientich();
    }
}
