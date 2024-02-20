
package PY00047.LAB7;

public class ChuNhat {
    final double rong;
    private final double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (rong + dai);
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chieu dai: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
    
}
