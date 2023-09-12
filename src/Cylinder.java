public class Cylinder extends Circle{
    private double chieuCao;

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double tinhTheTich(){
        double V= super.tinhDientich()*chieuCao;
//        System.out.println("Diện tích hình trụ: "+ V);
        return V;
    }
//    public void showInfoCylinder(){
//        System.out.println(toString());
//    }

    @Override
    public String toString() {
        return  super.toString() + ", Chiều cao: "+ chieuCao + ", Thể tích hình trụ là: " +tinhTheTich();
    }
}
