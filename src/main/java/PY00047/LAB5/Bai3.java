package PY00047.LAB5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Bai3 {
    static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    static void menu() {
        System.out.println("Chon chuc nang:");
        System.out.println("1. Nhap danh sach san pham");
        System.out.println("2. Sap xep giam dan theo gia va xuat danh sach");
        System.out.println("3. Tim va xoa san pham theo ten");
        System.out.println("4. Xuat gia trung binh cua cac san pham");

        int chon = scanner.nextInt();
        
        do{
            switch (chon) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    SapXepVaXuat();
                    break;
            case 3:
                    TimVaXoa();
                    break;
                case 4:
                    XuatGiaTrungBinh();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while(chon!=4);
    }
    static void Nhap() {
        scanner.nextLine();
        System.out.println("Nhap danh sach san pham (Nhap 'done' de ket thuc nhap): ");
        while (true) {
            System.out.print("Nhap ten san pham: ");
            String ten = scanner.nextLine();
            if (ten.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Nhap gia san pham: ");
            double gia = scanner.nextDouble();

            danhSachSanPham.add(new SanPham(ten, gia));
        }
    }

    static void SapXepVaXuat() {
        Comparator<SanPham> com = (SanPham o1, SanPham o2) -> Double.compare(o2.donGia, o1.donGia);

        Collections.sort(danhSachSanPham, com);

        System.out.println("Danh sach san pham sau khi sap xep giam dan theo gia:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Ten: " + sp.ten + ", Gia: " + sp.donGia);
        }
    }

    static void TimVaXoa() {
        scanner.nextLine();
        System.out.print("Nhap ten san pham can xoa: ");
        String tenCanXoa = scanner.nextLine();

        for (SanPham sp : danhSachSanPham) {
            if (sp.ten.equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(sp);
                System.out.println("Da xoa san pham co ten: " + sp.ten);
                return;
            }
        }
        System.out.println("Khong tim thay san pham co ten: " + tenCanXoa);
    }

    static void XuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sach san pham rong, khong the tinh gia trung binh.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.donGia;
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Gia trung binh cua cac san pham: " + giaTrungBinh);
    }
}
