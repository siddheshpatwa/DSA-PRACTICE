public class Pattern10 {


        public void erectArrow(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }       
    
}   

         public void invertedArrow(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }       
     }

   
   
   
    public static void main(String[] args) {
        int n = 5;
        Pattern10 pattern = new Pattern10();
        pattern.erectArrow(n);
        pattern.invertedArrow(n);
     }

}

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *