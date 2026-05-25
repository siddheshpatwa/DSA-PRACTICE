public class Pattern15 {
    
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // Convert ASCII value to character
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
    }
}


// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
