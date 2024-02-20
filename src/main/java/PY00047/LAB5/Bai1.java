package PY00047.LAB5;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> danhSachSoThuc = new ArrayList<>();

        while (true) {
            System.out.print("Nhap so thuc: ");
            double soThuc = scanner.nextDouble();
            danhSachSoThuc.add(soThuc);

            System.out.print("Nhap them (Y/N)? ");
            scanner.nextLine();
            String nhapThem = scanner.nextLine();

            if (nhapThem.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Danh sach so thuc ban vua nhap:");
        for (double soThuc : danhSachSoThuc) {
            System.out.println(soThuc);
        }

        double tong = 0;
        for (double soThuc : danhSachSoThuc) {
            tong += soThuc;
        }
        System.out.println("Tong cua danh sach la: " + tong);
    }
}
