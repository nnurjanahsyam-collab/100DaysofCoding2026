
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
            Scanner p = new Scanner(System.in);
            String hari = p.next();

            switch (hari.toLowerCase()) {
                case "senin", "selasa" , "rabu" , "khamis", "jumat":
                    System.out.println("Hari kerja");
                    break;
                case "sabtu" , "minggu":
                    System.out.println("Hari libur");
                    break;
                default:
                    System.out.println("Hari tidak valid");
                    break;
                    
                    
                    
            }

          

            

        
    }
    
    
}
