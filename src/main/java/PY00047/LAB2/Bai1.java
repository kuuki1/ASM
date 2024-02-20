package PY00047.LAB2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        double a,b,x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap he so cho phuong trinh bac nhat (aX+b=0) ");
        System.out.print("nhap he so a: ");
        a = scanner.nextDouble();
        System.out.print("nhap he so b: ");
        b = scanner.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem.");
            }else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        }else{
            x=-b/a;
            System.out.println("Phuong trinh co nghiem X la: "+x);
        }
    }
}
