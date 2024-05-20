import java.util.Scanner;

public class Student extends Person {
    private String maSinhVien;
    private double diemTrungBinh;
    private String email;

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên:");
        this.maSinhVien = scanner.nextLine();
        System.out.println("Nhập vào điểm trung bình:");
        this.diemTrungBinh = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào email:");
        this.email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public boolean duocHocBongKhong() {
        return diemTrungBinh >= 8.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
