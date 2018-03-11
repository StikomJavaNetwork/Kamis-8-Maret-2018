public class bintang4 {
    public static void main(String[] args) {
        int index = 5;
        
        for (int i = 0; i <= index; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = index; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
