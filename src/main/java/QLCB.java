import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình");
            String menu = scanner.nextLine();
            if (menu.equals("1")) {
                themCanBo();
            } else if (menu.equals("2")) {
                timKiemTheoHoTen();
            } else if (menu.equals("3")) {
                hienThiDSCB();
            } else if (menu.equals("4")) {
                xoaCanBoTheoTen();
            } else if (menu.equals("5")) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng");
            }
        }
    }

    public void xoaCanBoTheoTen() {
        System.out.println("Nhập vào tên cần xóa:");
        String ten = scanner.nextLine();
        canBoList.removeIf(canBo -> canBo.hoTen.contains(ten));
    }

    public void hienThiDSCB() {
        System.out.println("Danh sách cán bộ:");
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("Nhập vào họ tên cần tìm:");
        String hoTen = scanner.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.equals(hoTen)) {
                System.out.println(canBo);
            }
        }
    }

    public void themCanBo() {
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Chọn loại cán bộ muốn thêm:");
        String menu = scanner.nextLine();
        if (menu.equals("1")) {
            CongNhan congNhan = nhapVaoCongNhan();
            canBoList.add(congNhan);
        } else if (menu.equals("2")) {
            KySu kySu = nhapVaoKySu();
            canBoList.add(kySu);
        } else if (menu.equals("3")) {
            NhanVien nhanVien = nhapVaoNhanVien();
            canBoList.add(nhanVien);
        } else {
            System.out.println("Vui lòng chọn đúng loại cán bộ");
        }
    }

    private CongNhan nhapVaoCongNhan() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào bậc:");
        int bac = Integer.parseInt(scanner.nextLine());
        return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
    }

    private KySu nhapVaoKySu() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào ngành đạo tạo:");
        String nganhDaoTao = scanner.nextLine();
        return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
    }

    private NhanVien nhapVaoNhanVien() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào ngành đạo tạo:");
        String congViec = scanner.nextLine();
        return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
    }
}
