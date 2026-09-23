public class Day22 {
    public static void main(String[] args) {

        int a = 5,
                b = 10,
                c = 20,
                d = 50;

        System.out.println("==METODE TEMPORARY==");
        System.out.println("Sebelum di tukar: " + a);
        System.out.println("Sebelum di tukar: " + b);

        int wadah = a;
        a = b;
        b = wadah;

        System.out.println("Setelah di tukar: " + a);
        System.out.println("Setelah di tukar: " + b);

        System.out.println("==OPERASI ARITMATIKA==");
        System.out.println("Sebelum di tukar: " + c);
        System.out.println("Sebelum di tukar: " + d);

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("Setelah di tukar: " + c);
        System.out.println("Setelah di tukar: " + d);

    }
}
