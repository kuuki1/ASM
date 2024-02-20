package PY00047.Lab1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
    double cd,cr,cv,dt,min;
    Scanner scanner = new Scanner(System.in);
    System.out.print("chieu dai: ");
    cd = scanner.nextDouble();
    System.out.print("chieu rong: ");
    cr = scanner.nextDouble();
    cv=(cd+cr)*2;
    dt=cd*cr;
    min=Math.min(cd,cr);
    System.out.println("chu vi la: " +cv);
    System.out.println("dien tich la: "+dt);
    System.out.println("canh nho nhat la: "+min);
    
    }
}