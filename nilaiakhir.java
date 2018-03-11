import java.io.*;

class nilaiakhir {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	System.out.println("");
	System.out.println("===== Mengkitung Nilai Akhir =====");
	System.out.println("");
	System.out.print("Nama : ");
	String Nama = br.readLine();
	System.out.print("NIM : ");
	String NIM = br.readLine();
	System.out.println("");



	System.out.print("Nilai UTS            : ");
	Double UTS = Double.parseDouble(br.readLine());
	System.out.print("Nilai UAS            : ");
	Double UAS = Double.parseDouble(br.readLine());
	System.out.print("Nilai TUGAS          : ");
	Double TUGAS = Double.parseDouble(br.readLine());
	double na = ((0.3*UTS)+(0.3*UAS)+(0.4*TUGAS));

	String predikat ;
	System.out.println("1. sistem Informasi");
	System.out.println("2. sistem Komputer");
	System.out.println("3. Manajemen Informatika");

	System.out.print("Pilih jurusan : ");
	int prodi = Integer.parseInt(br.readLine());

	if (na >= 0 && na <= 19) predikat = "E";
	else if (na >= 20 && na <= 39) predikat = "D";
	else if (na >= 40 && na <= 59) predikat = "C";
	else if (na >= 60 && na <= 79) predikat = "B";
	else if (na >= 80 && na <= 100) predikat = "A";
	else predikat = ("LOL");

	System.out.println("nama : "+Nama);
	System.out.println("nim : "+NIM);

		switch(prodi){
			case 1:
				System.out.println("Prodi : Sistem Informasi");
				break;
			case 2:
				System.out.println("Prodi : Sistem Komputer");
				break;
			case 3:
				System.out.println("Prodi : Desain Komunikasi Visual");
				break;
			default:
				System.out.println("Pilihan Tidak Ada");
				break;
		}
		System.out.println("Nilai akhir : "+na);
		System.out.print("Predikat Nilai Akhir : "+predikat);
		System.out.println("");
	}
}