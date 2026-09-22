public class Day21 {
    public static void main(String[] args) throws Exception {
        //mengubah string menjadi tipe data primitif
        String a = "56";
        String l = "gh";

        byte b = Byte.parseByte(a);
        short c = Short.parseShort("100");
        int d = Integer.parseInt("10000");
        long e = Long.parseLong("1000000");
        float f = Float.parseFloat("75.5");
        double g = Double.parseDouble("145.5");
        boolean h = Boolean.parseBoolean("true");
        char i = l.charAt(0);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

    }
}
