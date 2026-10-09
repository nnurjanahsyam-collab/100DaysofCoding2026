import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("""
            === MENU RESTORAN ===
            1. Paket A - Rp25000
            2. Paket B - Rp35000
            3. Paket C - Rp45000     
        """);
        System.out.print("Pilih paket: ");
        char a = p.next().charAt(0); // a itu adalah paket yang akan saya pake
        System.out.print("Jumlah: ");
        double b = p.nextDouble(); // b  itu total paket
        double persen = 0;
        double totalH = 0, Harga = 0; 

        if(a == 'A'){
            Harga = 25000;
            totalH = Harga * b;
            if(totalH >= 100000){
                persen = 10;

            }else{
                    persen = 0;  
            }
            
        }else if(a == 'B'){
            Harga = 35000;
            totalH = Harga * b;
            if(totalH >= 100000){
                persen = 10;
            }else{
                persen = 0;
            }
        }else if(a == 'C'){
            Harga = 45000;
            totalH = Harga * b;
            if(totalH >= 100000){
                persen = 10;
            }else{
                persen = 0;
            }
            
        }else{
            System.out.println("Paket tidak valid");
            return;
        }

        double total = totalH * persen / 100;
        double sub = totalH - total;

        System.out.println("\nPaket\t\t: " + a);
        System.out.printf("Harga\t\t: Rp%.0f " , Harga);
        System.out.printf("\nJumlah\t\t: %.0f "  , b );
        System.out.printf("\nTotal\t\t: Rp%.0f " ,  totalH);
        System.out.printf("\nDiskon\t\t: Rp%.0f " , total);
        System.out.printf("\nTotal Bayar\t: Rp%.0f " , sub);

        
    }
    
}
