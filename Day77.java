
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("===== REGISTRASI AKUN =====\n");
        System.out.print("Masukkan username: ");
        String user = p.nextLine();
        System.out.print("Masukkan password: ");
        String pw  = p.nextLine();
        System.out.print("Konfirmasi password: ");
        String konfirmasi = p.nextLine();

        System.out.println(user.trim());
        System.out.println(user.toLowerCase());
        System.out.println(!user.isEmpty());
        System.out.println(user.length() <= 5);
        System.out.println(pw.length() <= 8);

       
        if(pw.equals(konfirmasi)){
            System.out.println("Registrasi berhasil");

        }else{
             System.out.println("Registrasi tidak berhasil");


        }
        
        
    }
    
}
