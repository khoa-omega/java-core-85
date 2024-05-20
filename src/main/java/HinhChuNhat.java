public class HinhChuNhat {
    private int width;
    private int height;

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int tinhChuVi() {
        return 2 * (width + height);
    }

    public int tinhDienTich() {
        return width * height;
    }
}
