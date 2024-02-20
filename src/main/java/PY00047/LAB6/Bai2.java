
package PY00047.LAB6;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SanPham sanPham = new SanPham();
            System.out.println("Nhap thong tin san pham thu " + (i + 1));
            sanPham.nhap();
            danhSachSanPham.add(sanPham);
        }
        System.out.println("Cac san pham co hang la Nokia:");
        for (SanPham sanPham : danhSachSanPham) {
            if ("Nokia".equalsIgnoreCase(sanPham.getHang())) {
                sanPham.xuat();
            }
        }
    }
}
