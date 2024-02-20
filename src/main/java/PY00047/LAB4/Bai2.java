
package PY00047.LAB4;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SanPham sp1 = new SanPham("sp 1",100);
        System.out.println("Nhap thong tin san pham 1:");
        sp1.nhap();

        SanPham sp2 = new SanPham("sp 2", 200);
        System.out.println("Nhap thong tin san pham 2:");
        sp2.nhap();

        System.out.println("Thong tin san pham 1:");
        sp1.xuat();

        System.out.println("----------------------");

        System.out.println("Thong tin san pham 2:");
        sp2.xuat();
    }
}
