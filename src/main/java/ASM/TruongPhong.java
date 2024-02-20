package ASM;

public class TruongPhong extends NhanVien {
    private final double trachnhiem;
    public TruongPhong(String manv, String hoten, double luong, double trachnhiem ) {
        super(manv, hoten, luong);
        this.trachnhiem = trachnhiem;
    }

    public double trachNhiem() {
        return trachnhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + trachnhiem;
    }
}
