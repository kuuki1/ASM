package PY00047.LAB2;
import java.util.Scanner;
public class Bai3 {
   public static void main(String[] args){
        double soDienSuDung,giaDienDuoi50=1000,giaDienTren50=1200,tienDien=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap so dien su dung trong thang: ");
            soDienSuDung=scanner.nextDouble();
            if(soDienSuDung>0){
                if(soDienSuDung<=50){
                tienDien=soDienSuDung*giaDienDuoi50;
                }else{
                tienDien=50*giaDienDuoi50+(soDienSuDung-50)*giaDienTren50;
                }
            System.out.println("So tien dien phai thanh toan la: "+tienDien+" VND");
            }else{
                System.out.println("So dien nhap vao khong dung, vui long nhap lai");
            }
        }while(soDienSuDung<0);
    }
}
