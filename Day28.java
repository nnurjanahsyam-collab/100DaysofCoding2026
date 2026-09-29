import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        //perbandingan sama dengan & tidak sama dengan
        Scanner p = new Scanner(System.in);
        int pas_baru = p.nextInt();
        int pas_lama = 737;

        boolean pw = pas_lama != pas_baru;
        boolean wp = pas_lama == pas_baru;
        System.out.println(pw);
        System.out.println(wp);

   
    }
    
}
