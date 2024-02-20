package PY00047.LAB2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        double a,b,c,x1,x2,x,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap he so cho phuong trinh bac hai (aX*X+bX+c)=0");
        System.out.print("nhap he so a: ");
        a=scanner.nextDouble();
        System.out.print("nhap he so b: ");
        b=scanner.nextDouble();
        System.out.print("nhap he so c: ");
        c=scanner.nextDouble();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem.");
                }else{
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }else{
                x=-c/b;
                System.out.println("Phuong trinh co nghiem X la: "+x);
            }
        }else{
            delta=Math.pow(b,2)-4*a*c;
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem.");
            }else if(delta==0){
                x=-b/(2*a);
                System.out.println("Phuong trinh co nghiem kep la X="+x);
            }else{
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet.");
                System.out.println("X1="+x1);
                System.out.println("X2="+x2);
            }
        }
    }
}