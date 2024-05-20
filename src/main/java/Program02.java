public class Program02 {
    public static void main(String[] args) {
//        Person person = new Student();
//        person.inputInfo();
//        person.showInfo();

        HinhChuNhat hinhChuNhat = new HinhChuNhat(20, 10);
        System.out.println("hinhChuNhat.tinhChuVi() = " + hinhChuNhat.tinhChuVi());
        System.out.println("hinhChuNhat.tinhDienTich() = " + hinhChuNhat.tinhDienTich());

        HinhVuong hinhVuong = new HinhVuong(10);
        System.out.println("hinhVuong.tinhChuVi() = " + hinhVuong.tinhChuVi());
        System.out.println("hinhVuong.tinhDienTich() = " + hinhVuong.tinhDienTich());
    }
}
