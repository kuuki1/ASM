package PY00047.Lab1;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        double c,tt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("canh: ");
        c = scanner.nextDouble();
        tt=c*c*c;
        //tt=Math.pow(c,3)
        System.out.print("the tich la: "+tt);
    }
    
}
