import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int n = p.nextInt();

        for (int i = n; i >= 1; i--) {
            if(i % 2 == 1){
                 System.out.println(i + " Ganjil");

            }
           
            
        }
        System.out.println();

        for (int j = n; j >= 1; j--) {
            if(j % 2 == 0){
                 System.out.println(j + " Genap");

            }
           
            
        }

        



    }    
}
