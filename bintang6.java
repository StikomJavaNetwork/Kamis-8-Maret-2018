public class bintang6 {
  public static void main(String[] args) {
    int index = 6;

        for (int i = 0; i <= index-1; i++) {
            for (int j = 0; j <=index-1; j++) {
              if( i == 0 && j==index-1){
                  System.out.print("Z");
              }else if(j== 0 && i == index-1){
              System.out.print("A");
            }else if(i==0 && j==0){
            System.out.print("A");
          }else if(i==index-1 && j == (index-1)){
              System.out.print("Z");
            }else{
              System.out.print("+");
            }
            }
          System.out.println(" ");
        }
    }
}
