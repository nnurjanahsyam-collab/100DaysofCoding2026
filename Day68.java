
import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int m = p.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                continue;
            }else if(i % 2 == 0){
                System.out.println("Angka Genap: " + i);
                if(i % m == 0){
                    System.out.println("Target kelipatan ditemukan!");
                    break;
                }
            }
            
        }
    }
    
}
