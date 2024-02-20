package PY00047.LAB7;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai4 {
    static ArrayList<SinhVien> danhSachSV = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
    }

    static void Nhap() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh vien thu "+(i+1)+":");
            System.out.print("Nhap ma sinh vien: ");
            String maSV = scanner.next();
            System.out.print("Nhap ten sinh vien: ");
            String tenSV = scanner.next();
            System.out.print("Nhap diem sinh vien: ");
            double diem = scanner.nextDouble();
            SinhVien sv = new SinhVien(maSV, tenSV, diem);
            danhSachSV.add(sv);
            scanner.nextLine();
        }
    }

    static void Xuat() {
        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv : danhSachSV) {
        System.out.printf("Ma SV: %s, Ten SV: %s, Diem: %.2f%n", sv.maSV, sv.tenSV, sv.diem);
        }
    }

    static void XuatGioi() {
        System.out.println("Danh sach sinh vien co hoc luc gioi:");
        danhSachSV.stream().filter(sv -> sv.diem >= 8.0)
                .forEach(sv -> System.out.println("Ma SV: " + sv.maSV + ", Ten SV: " + sv.tenSV + ", Diem: " + sv.diem));
    }

    static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Ket thuc");

            System.out.print("Chon chuc nang (1-4): ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    XuatGioi();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Chon khong hop le. Vui long chon lai.");
            }
        } while (chon != 4);
    }
}
