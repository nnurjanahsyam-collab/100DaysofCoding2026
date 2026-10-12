import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan suhu ruangan: ");
        int suhu = p.nextInt();

        if(suhu < 18){
            System.out.println("Ruangan Dingin");
        }else if(suhu <= 25){
            System.out.println("Ruangan Sejuk");
        }else if(suhu <= 30){
            System.out.println("Ruangan Hangat");
        }else{
            System.out.println("Ruangan Panas");
        }
    }
    
}
