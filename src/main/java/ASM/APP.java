
package ASM;
import java.util.Scanner;
public class APP {

    public static void main(String[] agrs){
        int tl = 0;
        giaodien(tl);
    }
    private static void giaodien(int tl){
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while(a){
            System.out.println("Ban chon vao chuong trinh(1.Yes/2.No)");
            try{
                System.out.print("Ban chon:");
                tl = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                scanner.nextLine();
            }
            switch (tl) {
                case 1:
                    System.out.println(" ");
                    System.out.println("                           / \\  //\\\\");
                    System.out.println("              |\\___/|     /   \\//  \\");
                    System.out.println("              /0  0  \\__  /    //  | \\ \\");
                    System.out.println("             /     /  \\/_/    //   |  \\  \\");
                    System.out.println("            @_^_@'/   \\/_   //    |   \\   \\");
                    System.out.println("            //_^_/     \\/_ //     |    \\    \\");
                    System.out.println("           ( // )|        \\//      |     \\     \\");
                    System.out.println("         ( / / ) _|_ /   )  //       |      \\     _\\");
                    System.out.println("       ( // /) '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-.");
                    System.out.println("     (( / / )) ,-{        _      `-.|.-~-.           .~         `.");
                    System.out.println("    (( // / ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\");
                    System.out.println("    (( /// ))      `.   {            }                   /      \\  \\");
                    System.out.println("     (( / ))     .----~-.\\        \\-'                 .~         \\  `.^-.");
                    System.out.println("                ///.----..>        \\             _ -~              `  }");
                    System.out.println("                   ///-._ _ _ _ _ _ _}^ - - - - ~                     /");
                    System.out.println("                                                                          /");
                    System.out.println("                                                                        /");
                    System.out.println("                                                                      /");
                    a = false;                
                    String[] args = null;
                    ManHinhChinh.main(args);
                    break;
                case 2:
                    System.out.println("Cam on ban da su dung");
                    a = false;
                    break;
                default:
                    System.out.println("Ban chon khong hop le, vui long chon lai");
                    a = true;
                    break;
                }
            System.out.println(" ");
        }
    }
}
