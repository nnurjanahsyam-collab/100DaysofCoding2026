public class day10 {
    public static void main(String[] args) {
        // PEMAHAMAN BATAS MINIMAL DAN MAXSIMAL DARI TIPE DATA PRIMITIF
        System.out.println("byte\t: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);
        System.out.println("short\t: " + Short.MIN_VALUE + " sampai " + Short.MAX_VALUE);
        System.out.println("int\t: " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);
        System.out.println("long\t: " + Long.MIN_VALUE + " sampai " + Long.MAX_VALUE);
        System.out.println("double\t: " + Double.MIN_VALUE + " sampai " + Double.MAX_VALUE);
        System.out.println("float\t: " + Float.MIN_VALUE + " sampai " + Float.MAX_VALUE);
        System.out.println("char\t: " + (int) Character.MIN_VALUE + " sampai " + (int) Character.MAX_VALUE);
        // Kenapa pake intt??? agar yang keluar bilangan bulat bukan karakter

        System.out.println("Boolean\t: tidak ada batas karena dia hanya ada dua kondisi yaitu true/false");

    }

}
