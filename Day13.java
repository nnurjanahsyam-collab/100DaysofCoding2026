package javaapplication17;

import java.util.Scanner;



public class Soal1 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String Nama = p.nextLine();
        
        System.out.print("Masukkan Tahun Sekarang: ");
        int tahunSekarang = p.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = p.nextInt();
        
        int hasil = tahunSekarang - tahunLahir;
        
        System.out.println("Nama :" + Nama);
        System.out.println("Umur :" + hasil + " Tahun");
        
        
          
    }
}

package javaapplication17;

import java.util.Scanner;




public class Soal2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Barang: ");
        String hargaBarang = p.nextLine();
        
        System.out.print("Harga: ");
        int Harga = p.nextInt();
        System.out.print("jumlah: ");
        int Jumlah = p.nextInt();
        
        int hasil = Harga * Jumlah;
        
        System.out.print("Total: " + hasil );
                
        
        
    }
    
}


package javaapplication17;

import java.util.Scanner;


public class soal3 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("panjang: ");
        int Panjang = p.nextInt();
        System.out.print("lebar: ");
        int Lebar = p.nextInt();
        
        
        int hasil = Panjang * Lebar;
        
        System.out.print("Luas: " + hasil);
        
    }
    
}
