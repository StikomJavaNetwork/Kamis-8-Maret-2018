import java.util.Scanner;

public class Utama1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Game gameA = new Game ("","","");
        Game gameB = new Game ("","","","","");
      try{
        do{
            System.out.println("======================");
            System.out.println("\tMENU GAME");
            System.out.println("======================");
            System.out.println("1. Input Game A");
            System.out.println("2. Input Game B");
            System.out.println("3. Lihat data game");
            System.out.println("4. Keluar");
            System.out.println("======================");
            System.out.print("Pilihan anda : ");
            int pilih = Integer.parseInt(scan.nextLine());

            switch(pilih){
                case 1:
                    System.out.println("=================");
                    System.out.println("\tGAME A");
                    System.out.println("=================");

                    System.out.print("Masukkan kode : ");
                    String kode = scan.nextLine();
                    System.out.print("Masukkan nama : ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan lisensi : ");
                    String lisensi = scan.nextLine();

                    gameA = new Game(kode,nama,lisensi);
                    System.out.println();
                    System.out.println("### DATA GAME A TELAH DIISI ###");
                break;

                case 2:
                    System.out.println("=================");
                    System.out.println("\tGAME B");
                    System.out.println("=================");

                    System.out.print("Masukkan kode : ");
                    kode = scan.nextLine();
                    System.out.print("Masukkan nama : ");
                    nama = scan.nextLine();
                    System.out.print("Masukkan lisensi : ");
                    lisensi = scan.nextLine();
                    System.out.print("Masukkan jenis : ");
                    String jenis = scan.nextLine();
                    System.out.print("Masukkan tipe : ");
                    String tipe = scan.nextLine();

                    gameB = new Game(kode,nama,lisensi,jenis,tipe);
                    System.out.println();
                    System.out.println("### DATA GAME B TELAH DIISI ###");
                break;

                case 3:
                    System.out.println("======================");
                    System.out.println("\tDATA GAME");
                    System.out.println("======================");
                    System.out.println("GAME A");
                    System.out.println("Kode game A : "+gameA.getKode());
                    System.out.println("Nama game A : "+gameA.getNama());
                    System.out.println("Lisensi game A : "+gameA.getLisensi());
                    System.out.println("Jenis game A : "+gameA.getJenis());
                    System.out.println("Tipe game A : "+gameA.getTipe());

                    System.out.println();

                    System.out.println("GAME B");
                    System.out.println("Kode game B : "+gameB.getKode());
                    System.out.println("Nama game B : "+gameB.getNama());
                    System.out.println("Lisensi game B : "+gameB.getLisensi());
                    System.out.println("Jenis game B : "+gameB.getJenis());
                    System.out.println("Tipe game B : "+gameB.getTipe());
                break;

                case 4:
                    System.exit(0);
                break;
            }
        }while(true);
      } catch(Exception e){
      System.out.println("Inputan harus berupa angka");
    }
  }
}
