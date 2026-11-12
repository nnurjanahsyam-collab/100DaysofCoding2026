
import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = 0;

        while (true) { 
            int n = p.nextInt();
            if(n > 0){
                a += n;
                System.out.print(a + " + ");
            }else{
                System.out.println("program berhenti");
                break;
            }
            n++;
            
        }

      
      
    }

    
}
