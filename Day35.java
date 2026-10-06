import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        double ipk = p.nextDouble();
        String SE = p.next();

        if(ipk >= 3.00){
            if(SE.equalsIgnoreCase("kurang")){
                System.out.println("Mendapat beasiswa");
            }else if (SE.equalsIgnoreCase("cukup")){
                System.out.println("Tidak mendapat beasiswa");
            }
        }else{
            System.out.println("ipk tidak memenuhi");
        }
    }
    
    
}
