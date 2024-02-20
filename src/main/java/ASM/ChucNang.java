package ASM;
import java.util.Scanner;
public class ChucNang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int chon = 0, tl = 0;
        boolean a = true;
        do{
            System.out.println("----------------------------------- ");
            System.out.println("|CHUC NANG CHUONG TRINH            |");
            System.out.println("|1.Chuong trinh diem danh.         |");
            System.out.println("|2.Chuong trinh quan li tai chinh. |");
            System.out.println("|3.Chuong trinh bao cao.           |");
            System.out.println("|4.Chuong trinh lich trinh.        |");
            System.out.println("|5.Chuong trinh quan li nhan su.   |");
            System.out.println("|6.Chuong trinh su kien.           |");
            System.out.println("|7.Chuong trinh tong ket.          |");
            System.out.println("|8.Thoat                           |");
            System.out.println("----------------------------------- ");
            try{
                System.out.print("Ban chon: ");
                chon = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                scanner.nextLine();
            }
            switch(chon) {
                case 1 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 2 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 3 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 4 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 5 :
                    Menu.main(args);
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 6 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                            }       
                        }
                    break;
                case 7 :
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    OUTER:
                    while (a) {
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
                                a = true;
                                break OUTER;
                            case 2: {
                                System.out.println("Ban chon thoat chuong trinh.");
                                a = false;
                            }
                                System.exit(0);
                            default:
                                System.out.println("Ban nhap khong hop le, vui long nhap lai.");
                                a = true;
                                break;
                        }
                    }
                    break;
                case 8 :
                    System.out.println("Ban chon thoat chuong trinh.");
                    a = false;
                    break;
                default :
                    System.out.println("Ban chon khong hop le, vui long chon lai.");
            }
        }while(a);
    }
}
