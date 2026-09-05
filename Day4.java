public class day4 {
    public static void main(String[] args) {
        System.out.println("\"penggunaan tipe data numerik bilangan bulat,byte,short,int,dan long\"\f");
        System.out.println("\'KONSER DI LASINRANG PINRANG\'\n");
        byte TiketKonser = 120;            //untuk tipe data ini batasnya hanya sampai di angka 127 jika melebihi akan error
        short JumlahTiket = 32000;        //untuk short hanya sampai 32rb sahaja
        int JumlahPembeli = 2000000000; //dan int batas angkanya lebih banyak dan juga untuk tipe data ini sering di pakai banyak orang ,batasnya hanya sampai 2milliar
        long GajiArtis = 900000000L; //terakhir tipe data ini lebih banyak angkanya....batas angkanya hanya sampai 9 quintiliun

        System.out.println("Harga tiket konser  : " + TiketKonser + "rb");
        System.out.println("Jumlah tiket yang tersedia : " + JumlahTiket);
        System.out.println("Jumlah pembeli tiket : " + JumlahPembeli);
        System.out.println("Gaji artis yang datang ke konser : " + GajiArtis); 

    }

}
