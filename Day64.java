
import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = 1;

        for (int i = a; i >= 1; i--) {
            System.out.print("(" +i + ")");
            b *= i;

            
        }
        System.out.println("\n" + b);
        

        
    }
    
}
