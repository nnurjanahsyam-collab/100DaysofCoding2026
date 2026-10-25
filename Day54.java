
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();

        for (int i = 1; i < n; i++) { 
            if(i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
            }
            
        }
    }
    
}
