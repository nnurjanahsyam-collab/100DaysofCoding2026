
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int a = 1;

        for (int i = 1; i <= n; i++) {
            a *= i;
            
        }
        System.out.println(a);
    }
    
}

