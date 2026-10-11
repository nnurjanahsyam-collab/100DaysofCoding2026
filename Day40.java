import java.util.Scanner;

public class Soalmentor7 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        char b = p.next().charAt(0);

        int a = (char) b;
 
        if(a % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }

        
    }
    
}
