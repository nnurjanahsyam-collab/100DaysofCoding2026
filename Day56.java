
import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
            
        }
        System.out.println();
        for (int j = n; j >= 1; j--) {
            System.out.print(j + " ");
            
        }
        System.out.println();
    }
    
}
