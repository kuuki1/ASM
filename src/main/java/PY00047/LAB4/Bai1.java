
package PY00047.LAB4;

public class Bai1 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("San pham 1", 100.0, 10.0);
        sp1.xuat();

        System.out.println("----------------------");

        SanPham sp2 = new SanPham("San pham 2", 150.0);
        sp2.nhap();
        sp2.xuat();
    }
}
