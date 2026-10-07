import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();

        if(a > 0){
            System.out.println("Positif");
        }else if (a < 0){
            System.out.println("Negatif");
        }else{
            System.out.println("nol");
        }
    }
    
}
