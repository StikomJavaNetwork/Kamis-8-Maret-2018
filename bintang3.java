public class bintang3 {
    public static void main(String[] args) {
        int index = 5;
        
        for (int i = 0; i <= index; i++) {
            for (int j = index; j >=i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
