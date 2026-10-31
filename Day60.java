
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int a = 0;

        for (int i = 1; i <= n; i++) {
            a += i;
            
        }
        System.out.println(a);
    }
    
}
