package PY00047.Lab1;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        double a,b,ld,lk;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh tinh lai suat ngan hang");
        System.out.println("====================================");
        System.out.print("So tien goc(VND): ");
        a = scanner.nextDouble();
        System.out.print("Lai suat(%/nam): ");
        b = scanner.nextDouble();
        System.out.print("Thoi gian gui tiep kiem(nam): ");
        c = scanner.nextInt();
        System.out.println("====================================");
        ld = a*(1+c*b/100);
        lk = Math.pow(1+b/100,c)*a;
        System.out.println("[Lai Don] So tien khach hang nhan duoc sau "+c+" nam la: "+ld+" VND");
        System.out.print("Lai Kep] So tien khach hang nhan duoc sau "+c+" nam la: "+lk+" VND");
    }
    
}
