
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int m = p.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % m == 0){
                System.out.print(i + " ");
            }
        
        }
    }
    
}
