
package PY00047.LAB6;
import java.util.Scanner;
public class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
        System.out.println();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap hang: ");
        hang = scanner.nextLine();
    }

    public String getHang() {
        return hang;
    }
}
