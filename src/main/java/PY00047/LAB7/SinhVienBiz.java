
package PY00047.LAB7;
//bài 3
public class SinhVienBiz extends SinhVienPoly{
    private final double diemMarketing;
    private final double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
