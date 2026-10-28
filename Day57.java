
import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                System.out.println(i + " Ganjil");

            }
        }
        System.out.println();

        for (int j = 1; j <= n ; j++) {
            if(j % 2 == 0){
                System.out.println(j + " Genap");
            }
            
        }



    }
    
}
