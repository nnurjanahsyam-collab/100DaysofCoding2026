public class day18 {
    public static void main(String[] args) {
        // konversi otomatis (dari tipe data kecil ke besar)
        byte a = 127;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

}
