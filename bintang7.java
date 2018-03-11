import java.util.Scanner;
public class bintang7{
  public static void main(String[] args) {

    int a, b, e=0;

    System.out.print("Masukkan angka : ");
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();

      a = n;
      e = n-1;

        for (int k = 0; k <= n-2; k++) {
            for (int m = 0; m <= n*2-2; m++) {
                if (m==n-1){
                System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.print("");

      for (int l = 1; l <= n*2-1; l++) {
                System.out.print("*");
            }
        System.out.println();

      for(int i =1;i<=n;i++){
        b = 1;
            for(int j =1;j<=a;j++) {
                if (b<=e) {
                    System.out.print(" ");
                b++;
                } else {
                    if(j==b||j==a){

                        System.out.print("*");
                    }else
                        System.out.print(" ");
                    }
                }
                e--;
                a++;
            System.out.println();
        }
  }
}
