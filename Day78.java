import java.util.Scanner;

public class Day78 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        String username = "Nurjanah";
        int password = 220803;
      
        while (true){
            System.out.println("===== MEMBUAT AKUN MOBILE LEGEND =====\n");
            System.out.print("Masukkan username: ");
            String user = p.next();
            System.out.print("Masukkan password: ");
            int pw = p.nextInt();
            if(username.equalsIgnoreCase(user) && password == pw){
                System.out.println("Login berhasil!\n");
                break;

            }else if(!username.equalsIgnoreCase(user) && password == pw){
                System.out.println("Username salah silahkan coba kembali\n");

            }else if(username.equalsIgnoreCase(user) && password != pw){
                System.out.println("Password salah silahkan coba kembali\n");
            }else{
                System.out.println("Keduanya salah masukkan kembali username dan password dengan benar!!!\n");
            }
          

        }

    }
    
}
