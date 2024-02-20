package PY00047.LAB2;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, dt, cv;
         System.out.println("Nhap 3 so thuc");
        System.out.print("Nhap a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        if ((a+b)>c && (a+c)>b && (c+b)>a) {
            int chon;
            do {
                System.out.println("Menu:");
                System.out.println("1. Dien tich tam giac");
                System.out.println("2. Chu vi tam giac");
                System.out.println("3. Nhan dien tam giac");
                System.out.println("4. Thoat");
                System.out.println("-----------------------");
                System.out.print("Chon:");
                chon = scanner.nextInt();
                switch (chon) {
                    case 1 -> {
                        dt = tinhdientich(a, b, c);
                        System.out.println("Dien tich tam giac la: " + dt);
                    }
                    case 2 -> {
                        cv = tinhchuvi(a, b, c);
                        System.out.println("Chu vi tam giac la: " + cv);
                    }
                    case 3 -> nhandientamgiac(a, b, c);
                    case 4 -> System.out.println("Ban chon thoat.");
                    default -> System.out.println("Lua chon khong hop le. Vui long chon lai.");
                }
            } while (chon != 4);
        }else{
            System.out.println("3 so duoc nhap vao khong phai la 3 canh cua mot tam giac");
        }
    }

    private static void nhandientamgiac(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("Tam giac deu.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giac can.");
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            System.out.println("Tam giac vuong.");
        } else {
            System.out.println("Tam giac thuong.");
        }
    }

    private static double tinhchuvi(double a, double b, double c) {
        return a + b + c;
    }

    private static double tinhdientich(double a, double b, double c) {
        double s = (a + b + c) / 23;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
