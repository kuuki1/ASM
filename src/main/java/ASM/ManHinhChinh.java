package ASM;
import java.util.Scanner;
public class ManHinhChinh {
    public static void main(String[] args){
        int tl = 0;
        boolean dung = true;
        Scanner scanner = new Scanner(System.in);
        String a, b, c = "adm123@gmail.com", d = "123456789";
        System.out.println("Dang nhap tai khoan ");
        while(dung){
            System.out.print("Tai Khoan: ");
            a=scanner.nextLine();
            System.out.print("Mat khau: ");
            b=scanner.nextLine();
            if( a.equals(c) == dung  && b.equals(d) == dung) {
                System.out.println("Dang nhap thanh cong");
                ChucNang.main(args);
                OUTER:
                while (dung) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("|          1. Quay lai          2. Thoat          |");
                    System.out.println("---------------------------------------------------");
                    try{
                        System.out.print("Ban chon:");
                        tl = scanner.nextInt();
                    }catch (Exception e) {
                        System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                        scanner.nextLine();
                    }
                    switch (tl) {
                        case 1:
                            System.out.println("Ban chon Quay lai.");
                            dung = true;
                            break OUTER;
                        case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                dung = false;
                            }
                                System.exit(0);
                        default:
                            System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                            dung = true;
                            break;
                    }       
                }
            }else{
                System.out.println("Dang nhap that bai, vui long kiem tra lai");
                dung = true;
            }
        }
    }
}
