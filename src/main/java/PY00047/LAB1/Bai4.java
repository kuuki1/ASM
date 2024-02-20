package PY00047.Lab1;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        double a,b,c,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = scanner.nextDouble();
        System.out.print("nhap b: ");
        b = scanner.nextDouble();
        System.out.print("nhap c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        System.out.print("delta la: "+delta);
        System.out.print("can delta la: "+Math.sqrt(delta));
    }
    
    
}
