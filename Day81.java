
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++){
            angka[i] = p.nextInt();
            System.out.println(i + " = " + angka[i]);
        }

    }
    
}
