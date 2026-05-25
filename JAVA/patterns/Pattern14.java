public class Pattern14 {

public static void main(String[] args) {
    int n = 5; // Number of rows
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            // Convert ASCII value to character
            System.out.print((char)(64 + j) + " ");
        }
        System.out.println();
    }
}

    
}
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
