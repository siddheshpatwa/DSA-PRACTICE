public class Pattern17 {
    
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing characters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }
            // Print decreasing characters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j));
            }
            System.out.println();
        }
    }

}
//    A
//   ABA
//  ABCBA
// ABCDCBA