
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int cari = p.nextInt();
        int[] num = {30,20,40,50};
        boolean a = false;

        for (int i = 0; i < num.length; i++) {
           
            if (num[i] == cari) {
                cari = num[i];
                a = true;
                System.out.println("Ditemukan pada index: " + i);
                break;
            }
            
        }
        if(!a){
            System.out.println("Angka tidak di temukan");
        }


        
    }
    
}
