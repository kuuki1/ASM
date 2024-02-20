package PY00047.LAB3;
import java.util.Arrays;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        Arrays.sort(mang);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(mang));
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);
        double tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                dem++;
            }
        }
        double trungBinhCong = dem > 0 ? tong / dem : 0;
        System.out.println("Trung binh cong cac phan tu chia het cho 3: " + trungBinhCong);
    }
}
