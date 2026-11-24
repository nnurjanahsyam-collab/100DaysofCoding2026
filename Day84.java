public class Day84 {
    public static void main(String[] args) {
        int[] num = {3,6,9,2};
        int a = num[0];
        
        for (int i = 0; i < num.length; i++) {
            if(a < num[i]) {
                a = num[i];
                
            }
            
        }
        System.out.println(a);
        
    }
    
}
