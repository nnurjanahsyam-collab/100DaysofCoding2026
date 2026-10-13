import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String a = p.nextLine();
        System.out.print("Masukkan Gaji pokok: ");
        int b = p.nextInt();
        int pajak = 0;


        if(b >= 3000000){
            pajak = 10;
        }else{
            pajak = 5;
        }

        int GajiKotor = b * pajak / 100;
        int GajiBersih = b - GajiKotor;
        
        System.out.println("Nama: " + a);
        System.out.println("Gaji Pokok: Rp " + b);
        System.out.println("Pajak: " + pajak + "%");
        System.out.println("Gaji Kotor: Rp" + GajiKotor);
        System.out.println("Gaji Bersih: Rp" + GajiBersih);


    }
    
}
