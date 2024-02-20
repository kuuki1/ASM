package PY00047.LAB5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai2 {
    static ArrayList<String> danhSachHoTen = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    private static void menu() {
        System.out.println("Chon chuc nang:");
        System.out.println("1. Nhap danh sach ho ten");
        System.out.println("2. Xuat danh sach");
        System.out.println("3. Xuat danh sach ngau nhien");
        System.out.println("4. Sap xep giam dan va xuat danh sach");
        System.out.println("5. Tim va xoa ho ten");
        System.out.println("6. Ket thuc");

        int chon = scanner.nextInt();

        switch (chon) {
            case 1:
                nhap();
                break;
            case 2:
                xuat(danhSachHoTen);
                break;
            case 3:
                ngaunhien();
                break;
            case 4:
                sapxep();
                break;
            case 5:
                xoa();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

    private static void nhap() {
        scanner.nextLine();
        while (true) {
            String hoTen = scanner.nextLine();
            danhSachHoTen.add(hoTen);

            System.out.print("Nhap them (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    private static void xuat(ArrayList<String> danhSach) {
        System.out.println("Danh sach ho ten:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    private static void ngaunhien() {
        Collections.shuffle(danhSachHoTen);
        xuat(danhSachHoTen);
    }

    private static void sapxep() {
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        xuat(danhSachHoTen);
    }

    private static void xoa() {
        scanner.nextLine();
        System.out.print("Nhap ho ten can xoa: ");
        String hoTenCanXoa = scanner.nextLine();

        for (String hoTen : danhSachHoTen) {
            if (hoTen.equalsIgnoreCase(hoTenCanXoa)) {
                danhSachHoTen.remove(hoTen);
                System.out.println("Da xoa " + hoTen);
                break;
            }
        }
    }
}
