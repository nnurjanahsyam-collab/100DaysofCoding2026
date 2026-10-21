import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();

        String b = a % 2 == 0 ? "Genap" : "Ganjil";
        System.out.println(b);
    }
    
}
