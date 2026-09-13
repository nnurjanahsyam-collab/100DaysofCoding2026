import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nama;
        int Umur;
        char JenisKelamin;
        String Alamat;
        String Jurusan;
        String Hobi;

        System.out.println("===== BIODATA =====");
        System.out.print("Nama      :");
        Nama = sc.nextLine();
        System.out.print("Umur     :");
        Umur = sc.nextInt();
        System.out.print("JenisKelamin :");
        sc.nextLine();
        JenisKelamin = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Alamat    :");
        Alamat = sc.nextLine();
        System.out.print("Jurusan    :");
        Jurusan = sc.nextLine();
        System.out.print("Hobi    :");
        Hobi = sc.nextLine();
        System.out.println("===================");

    }

}
