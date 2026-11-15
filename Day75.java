public class Day75 {
    public static void main(String[] args) {
        String a = "Saya Nurjanah";
        String b = "";
         
        //membandingkan string dan equals harus sama besar kecilnya sesuai value a
         System.out.println(a.equals("Saya Nurjanah"));
        // equalsIgnoreCase harus sama tapi tidak memandang besar kecilnya 
         System.out.println(a.equalsIgnoreCase("saya nurjanah"));
        // contains mencari apakah kata inputan ada dengan kata yang di bandingkan
         System.out.println(a.contains("Nurjanah"));
        // isEmpty mengecek variabel b terisi atau kosong "" = kosong dan " " = ada isinya 
         System.out.println(b.isEmpty());
    
    }
    
}
