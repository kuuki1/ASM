
package PY00047.LAB4;

public class Bai3 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("San pham 1", 100.0, 10.0);
        SanPham sp2 = new SanPham("San pham 2", 150.0);

        System.out.println("Thong tin san pham 1:");
        sp1.xuat();

        System.out.println("----------------------");

        System.out.println("Thong tin san pham 2:");
        sp2.xuat();
    }
}
