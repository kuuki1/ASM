package PY00047.LAB3;
import java.util.Scanner;
import java.util.Arrays;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua day: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        boolean laGiamDan = true;
        for (int i = 1; i < n; i++) {
            if (mang[i - 1] < mang[i]) {
                laGiamDan = false;
                break;
            }
        }
        if (laGiamDan) {
            System.out.println("Day la day giam dan.");
        } else {
            System.out.println("Day khong phai la day giam dan.");
        }
        Arrays.sort(mang);
        int[] mangGiamDan = new int[n];
        for (int i = 0; i < n; i++) {
            mangGiamDan[i] = mang[n - i - 1];
        }
        System.out.println("Day sau khi sap xep giam dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(mangGiamDan[i] + " ");
        }
    }
}
