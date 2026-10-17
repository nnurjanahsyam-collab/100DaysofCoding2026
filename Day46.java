
import java.util.Scanner;

public class Day46 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("""
            1. Nasi Goreng 
            2. Mie Goreng
            3. Ayam Geprek
            4. Es Teh
        """);
        System.out.print("Masukkan pilihan: ");
        int menu = p.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Nasi Goreng");
                break;
            case 2:
                System.out.println("Mie Goreng");
                break;
            case 3:
                System.out.println("Ayam Geprek");
                break;
            case 4:
                System.out.println("Es Teh");
                break;
            default:
               System.out.println("Tidak ada pilihan menu!!");
        }

    }
    

    
}
