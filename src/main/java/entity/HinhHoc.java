package entity;

public abstract class HinhHoc {
    public static int count;

    public HinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            String message = "Số lượng hình tối đa là: "
                    + Configs.SO_LUONG_HINH_TOI_DA;
            throw new HinhHocException(message);
        }
        count++;
    }

    public abstract double tinhChuVi();

    public abstract double tinhDienTich();
}
