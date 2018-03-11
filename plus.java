public class plus {
  public static void main(String[] args) {
    int index = 6;

        for (int i = 0; i <= index; i++) {
            for (int j = 0; j <=index; j++) {
                if (i==3||j==3) {
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
  }
}
