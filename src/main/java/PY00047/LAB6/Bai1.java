
package PY00047.LAB6;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();
        int viTriDauTien = hoTen.indexOf(" ");
        int viTriCuoiCung = hoTen.lastIndexOf(" ");
        String ho = hoTen.substring(0, viTriDauTien).toUpperCase();
        String tenDem = hoTen.substring(viTriDauTien + 1, viTriCuoiCung);
        String ten = hoTen.substring(viTriCuoiCung + 1).toUpperCase();
        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten);
    }
}
