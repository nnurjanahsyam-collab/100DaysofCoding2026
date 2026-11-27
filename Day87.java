
import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int[] num = new int[5];
        System.out.print("Sebelum di manipulasi: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = p.nextInt();
            
        }
        System.out.print("Setelah di manipulasi: ");
          for (int i = 0; i < num.length; i++) {
            num[i] *= 2;
            System.out.print(num[i] + " ");
          
            
        }
        
    }
    
}
