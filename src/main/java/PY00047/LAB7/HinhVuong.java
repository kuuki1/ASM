
package PY00047.LAB7;

public class HinhVuong extends ChuNhat{

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + super.rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
    
}
