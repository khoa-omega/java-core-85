package entity;

public class HinhTron extends HinhHoc {
    private double radius;

    public HinhTron(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return radius * radius * Math.PI;
    }
}
