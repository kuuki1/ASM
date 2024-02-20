package PY00047.LAB3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean hopLe = false;
            int ngay = 0, thang = 0, nam = 0, gio, phut, giay;
            while (!hopLe) {
                try {
                    System.out.print("Nhap ngay (1-31): ");
                    ngay = scanner.nextInt();
                    System.out.print("Nhap thang (1-12): ");
                    thang = scanner.nextInt();
                    System.out.print("Nhap nam (>2000): ");
                    nam = scanner.nextInt();
                    System.out.print("Nhap gio (0-23): ");
                    gio = scanner.nextInt();
                    System.out.print("Nhap phut (0-59): ");
                    phut = scanner.nextInt();
                    System.out.print("Nhap giay (0-59): ");
                    giay = scanner.nextInt();
                    hopLe = kiemTraNgayThang(ngay, thang, nam, gio, phut, giay);
                } catch (Exception e) {
                    System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                    scanner.nextLine();
                }
            }
            hienThiMenu();
            int luaChon;
            do {
                System.out.print("Nhap vao lua chon cua ban (1-5): ");
                luaChon = scanner.nextInt();
                xuLyLuaChon(luaChon, ngay, thang, nam);
            } while (luaChon != 5);
            System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
        }
    }
    
    private static void hienThiMenu() {
        System.out.println("Ban muon lam gi tiep theo?");
        System.out.println("1. Tim ngay ke tiep");
        System.out.println("2. Tim ngay truoc do");
        System.out.println("3. Tim ngay nhap vao la ngay thu bao nhieu trong nam");
        System.out.println("4. Xuat ra tong so ngay + gio phut giay le da trai qua ke tu ngay 01/01/2000 00:01:00 den thoi diem ngay gio duoc nhap vao");
        System.out.println("5. Thoat chuong trinh");
    }
    
    private static void xuLyLuaChon(int luaChon, int ngay, int thang, int nam) {
        switch (luaChon) {
            case 1 -> timNgayKeTiep(ngay, thang, nam);
            case 2 -> timNgaytruocDo(ngay, thang, nam);
            case 3 -> {
                int tong = 0;
                tinhNgayTrongNam(ngay, thang, nam, tong);
            }
            case 4 -> tinhTongSoNgay(ngay, thang, nam);
            case 5 -> System.out.println("Ban chon thoat chuong trinh.");
            default -> System.out.println("Lua chon khong hop le. Vui long nhap lai.");
        }
    }
    
    private static void timNgayKeTiep(int ngay, int thang, int nam) {
        int ngayKeTiep = ngay + 1;
        int thangKeTiep = thang;
        int namKeTiep = nam;
        if (ngayKeTiep > soNgayTrongThang(thang, nam)) {
            ngayKeTiep = 1;
            thangKeTiep++;
            if (thangKeTiep > 12) {
                thangKeTiep = 1;
                namKeTiep++;
            }
        }
        System.out.println("Ngay ke tiep la: " + ngayKeTiep + "/" + thangKeTiep + "/" + namKeTiep);
    }
    
    private static void timNgaytruocDo(int ngay, int thang, int nam) {
        int ngaySauDo = ngay - 1;
        int thangSauDo = thang;
        int namSauDo = nam;
        if (ngaySauDo == 0) {
            thangSauDo--;
            if (thangSauDo == 0) {
                thangSauDo = 12;
                namSauDo--;
            }
            ngaySauDo = soNgayTrongThang(thangSauDo, namSauDo);
        }
        System.out.println("Ngay sau do la: " + ngaySauDo + "/" + thangSauDo + "/" + namSauDo);
    }
    
    private static void tinhNgayTrongNam(int ngay, int thang, int nam, int tong ) {
        tong = ngay;
        for (int i = 1; i < thang; i++) {
            switch (i) {
                case 4, 6, 9, 11 -> tong += 30;
                case 2 -> tong += 28 + (namNhuan(nam) ? 1 : 0);
                default -> tong += 31;
            }
        }
        System.out.println("Ngay thu: " + tong);
    }
    
    private static void tinhTongSoNgay(int ngay, int thang, int nam) {
        int soNgay = 0;
        for (int i = 2000; i < nam; i++) {
            soNgay += (namNhuan(i) ? 366 : 365);
        }
        for (int i = 1; i < thang; i++) {
            soNgay += soNgayTrongThang(i, nam);
        }
        soNgay += ngay;
        System.out.println("Tong so ngay + gio phut giay le da trai qua ke tu ngay 01/01/2000 00:01:00 den thoi diem ngay gio duoc nhap vao la: " + soNgay + " ngay");
    }
 
      private static boolean namNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
    
    private static int soNgayTrongThang(int thang, int nam) {
        return switch (thang) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (namNhuan(nam)) ? 29 : 28;
            default -> 31;
        };
    }
    
    private static boolean kiemTraNgayThang(int ngay, int thang, int nam, int gio, int phut, int giay) {
        if (thang < 1 || thang > 12 || ngay < 1 || ngay > 31 || nam < 1 || gio < 0 || gio > 23 || phut < 0 || phut > 59 || giay < 0 || giay > 59) {
            System.out.println("Ngay gio khong hop le. Vui long kiem tra lai.");
            return false;
        }
        if (thang == 2) {
            if (namNhuan(nam)) {
                if (ngay > 29) {
                    System.out.println("Ngay khong hop le trong nam nhuan.");
                    return false;
                }
            } else {
                if (ngay > 28) {
                    System.out.println("Ngay khong hop le trong nam khong nhuan.");
                    return false;
                }
            }
        }if((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay > 30){
            System.out.println("Ngay thang khong hop le. Vui long kiem tra lai.");
            return false;
        }
        if ((thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) && ngay > 31) {
            System.out.println("Thang " + thang + " chi co toi da 31 ngay. Vui long kiem tra lai.");
            return false;
        }
        if(nam<2000){
            System.out.println("Nam khong hop le. Vui long nhap lai");
            return false;
        }
        return true;
    }
}