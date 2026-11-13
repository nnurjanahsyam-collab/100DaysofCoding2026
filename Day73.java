
import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.print("""
                1. Nasi Goreng
                2. Mie Goreng
                3. Es Teh
                0. keluar
            """);
            menu = p.nextInt();

            if(menu == 1){
                System.out.println("pesanan anda sedang diproses!");
                break;
            }else if(menu == 2){
                System.out.println("pesanan anda sedang diproses!");
                break;
            }else if (menu == 3) {
                System.out.println("pesanan anda sedang diproses!");
                break;
            }

            if (menu == 0 ) {
                System.out.println("Terimah kasih!!");

                break;
            }
            menu++;


        }while (true);
        
    }
    
}
