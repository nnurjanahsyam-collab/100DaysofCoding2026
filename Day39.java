import java.util.Scanner;

public class Day39 {
     public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = p.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = p.nextInt();
        System.out.print("Masukkan pilihan: ");
        char c = p.next().charAt(0);
        int hasil = 0;

        if(c == 'A'){
            hasil = a + b;
        }else if(c == 'B'){
            hasil = a - b;
        }else if(c == 'C'){
            hasil = a * b;
        }else if(c == 'D'){
            hasil = a / b;
        }else if(c == 'F'){
            hasil = a % b;
        }else{
            System.out.println("tidak valid!!");

        }

        System.out.println("Hasil: " + hasil);
     }
    
}
