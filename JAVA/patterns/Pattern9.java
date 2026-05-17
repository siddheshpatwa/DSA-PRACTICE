class Pattern9 {
   
    public void erectPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


     public void invertedPyramid(int n) {
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
   
   
    public static void main(String[] args) {
        int n = 5;
        Pattern9 pattern = new Pattern9();
        pattern.erectPyramid(n);
        pattern.invertedPyramid(n);
    }
 }
  
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *