
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        char c = p.next().charAt(0);
        int d = 0;

        switch (c) {
            case '+' :
                d = a + b;
                System.out.println("Penjumlahan: " + d);
                break;
             case '-' :
                d = a - b;
                System.out.println("Pengurangan: " + d);
                break;
            case '*' :
                d = a * b;
                System.out.println("Perkalian: " + d);
                break;
            case '/' :
                d = a / b;
                System.out.println("Pembagian: " + d);
                break;
            case '%' :
                d = a % b;
                System.out.println("Modulus: " + d);
                break;
            default:
                System.out.println("Error");
        }
    }
    
}
