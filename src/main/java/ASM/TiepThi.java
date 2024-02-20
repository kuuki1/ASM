package ASM;

public class TiepThi extends NhanVien {
    private final double doanhso;
    private final double hoaHong;

    public TiepThi(String manv, String hoten, double luong, double doanhso, double hoaHong) {
        super(manv, hoten, luong);
        this.doanhso = doanhso;
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + doanhso * hoaHong;
    } 
}
