import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    protected String ten;
    protected GioiTinh gioiTinh;
    protected LocalDate ngaySinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String ten, GioiTinh gioiTinh, LocalDate ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        this.ten = scanner.nextLine();
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        if (menu.equals("1")) {
            this.gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            this.gioiTinh = GioiTinh.NU;
        } else {
            this.gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào ngày sinh:");
        this.ngaySinh = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.diaChi = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
