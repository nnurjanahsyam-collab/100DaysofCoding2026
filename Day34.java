import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int nilai = p.nextInt();

        if(nilai >= 75){
            System.out.println("Lulus");
        }else if(nilai < 75){
            System.out.println("Tidak Lulus");
        }else{
            System.out.println("tidak terbaca");
        }

    }
    
}
