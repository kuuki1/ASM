
package PY00047.LAB4;
import java.util.Scanner;
public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + getTenSp());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Giam gia: " + getGiamGia());
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        setTenSp(scanner.nextLine());

        System.out.print("Nhap don gia: ");
        setDonGia(scanner.nextDouble());

        System.out.print("Nhap giam gia: ");
        setGiamGia(scanner.nextDouble());
    }
// bài 4
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
// bài 4
}