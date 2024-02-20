package PY00047.LAB3;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        System.out.print("Nhap so luong sinh vien: ");
        n=scanner.nextInt();
        String[] hoten = new String[n];
        double[] diem = new double[n];
        for ( i = 0; i < n; i++) {
            System.out.print("Nhap ho va ten sinh vien thu " + (i + 1) + " :");
            hoten[i] = scanner.nextLine();
            scanner.nextLine();
            boolean nhapDiemHopLe = false;
            do {
                System.out.print("Nhap diem cua sinh vien thu " + (i + 1) + " :");
                if (scanner.hasNextDouble()) {
                    diem[i] = scanner.nextDouble();
                    nhapDiemHopLe = kiemtradiem(diem[i]);
                } else {
                    System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                    scanner.next();
                }
            } while (!nhapDiemHopLe);
        }
        System.out.println("\nThong tin sinh vien va hoc luc:");
        for ( i = 0; i < n; i++) {
            String hocLuc;
            if (diem[i] < 5) {
                hocLuc = "Yeu";
            } else if (diem[i] < 6.5) {
                hocLuc = "Trung binh";
            } else if (diem[i] < 7.5) {
                hocLuc = "Kha";
            } else if (diem[i] < 9) {
                hocLuc = "Gioi";
            } else {
                hocLuc = "Xuat sac";
            }
            System.out.println("Ho ten: " + hoten[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc + "\n");
        }
        for ( i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tempdiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempdiem;
                    String temphoten = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = temphoten;
                }
            }
        }
         System.out.println("Danh sach sinh vien sau khi sap xep theo diem tang dan:");
        for ( i = 0; i < n; i++) {
            System.out.println("Ho ten: " + hoten[i] + ", diem: " + diem[i]);
        }
    }
    private static boolean kiemtradiem(double diem) {
        if (diem < 0 || diem > 10) {
            System.out.println("Diem khong hop le, vui long nhap lai");
            return false;
        }
        return true;
    }
}