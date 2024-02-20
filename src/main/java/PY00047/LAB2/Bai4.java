package PY00047.LAB2;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        int chon;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Chuong trinh MENU.");
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giai phoung trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Moi ban chon chuong trinh: ");
            chon = scanner.nextInt();
            switch(chon){
                case 1 -> {
                    System.out.println("Ban chon chuong trinh giai phuong trinh bac nhat.");
                    Bai1.main(args);
                }
                case 2 -> {
                    System.out.println("Ban chon chuong trinh giai phuong trinh bac 2.");
                    Bai2.main(args);
                }
                case 3 -> {
                    System.out.println("Ban chon chuong trinh tinh tien dien.");
                    Bai3.main(args);
                }
                case 4 -> System.out.println("Ban chon ket thuc.");
                default -> System.out.println("Ban chon khong hop le, vui long chon lai.");
            }
        }while(chon!=4);
    }
}
