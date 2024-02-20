package ASM;

public class NhanVien {
    private String manv;
    private String hoten;
    private double luong;

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN() {
        if (this.getThuNhap() <= 9000000) {
            return 0.0;
        } else if (this.getThuNhap() > 9000000 && this.getThuNhap() <= 15000000) {
            return (this.getThuNhap() - 9000000) * 10;
        } else {
            return (this.getThuNhap() - 15000000) * 12 + (15000000 - 9000000) * 10;
        }
    }

    public void xuatThongTin() {
        System.out.println("Ma NV: " + manv);
        System.out.println("Ho ten: " + hoten);
        System.out.println("Luong: " + luong + "VND");
    }
    
    public String getMaNV() {
        return manv;
    }

    public void setMaNV(String MaNV){
        this.manv = MaNV;
    }
    
    public String getHoTen(){
        return hoten;
    }
    
    public void setHoTen(String HoTen){
        this.hoten = HoTen;
    }
    
    public double getLuong(){
        return luong;
    }
    
    public void setLuong(double Luong){
        this.luong = Luong;
    }
}
