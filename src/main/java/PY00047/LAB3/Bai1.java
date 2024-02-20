package PY00047.LAB3;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, x, count=0;
        System.out.print("Moi nhap so can kiem tra: ");
        x=scanner.nextInt();
        for ( i = 2; i < x; i++){
            if (x % i == 0){
		count++;
            }
            if(count == 0){
		System.out.println(x+" la so nguyen to");
                break;
            }else{
                System.out.println(x+" khong phai la so nguyen to");
                break;
            }
	}
    }
}
