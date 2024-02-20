
package PY00047.LAB7;
//bài 2
public abstract class SinhVienPoly {
    private final String hoTen;
    private final String nganh;
    
    SinhVienPoly(String hoTen,String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();

        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
