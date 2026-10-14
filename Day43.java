import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println("Kelipatan 3 dan 5");
        }else if(a % 3 == 0){
            System.out.println("Kelipitan 3");          
        }else if(a % 5 == 0){
            System.out.println("kelipatan 5");
        }else{
            System.out.println("bukan kelipatan 3 dan 5");
        }
    }
    
}
