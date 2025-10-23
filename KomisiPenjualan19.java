import java.util.Scanner;
public class KomisiPenjualan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Input omset, rating, sertifikasi
        double omset;
        int rating;
        String Sertifikasi;
        System.out.println("Masukkan Omset (Rp): ");
        omset = sc.nextDouble();
        System.out.println("Masukkan Rating (1-100): ");
        rating = sc.nextInt();
        sc.nextLine();
// Menentukan sertifikasi
        System.out.println("Apakah memiliki sertifikasi (Ya/Tidak): ");
        Sertifikasi = sc.next();
//  Validasi Input
        if (omset < 0) {
            System.out.println("Error: Omset tidak boleh negatif.");
            return;
        }
        if (rating < 1 || rating > 100) {
            System.out.println("Error: Rating harus antara 1-100.");
            return;
        }
        if (!Sertifikasi.equals("Ya") && !Sertifikasi.equals("Tidak")) {
            System.out.println("Error: Sertifikasi hanya boleh 'Ya' atau 'Tidak'. ");
            Sertifikasi = sc.next();
        }
// Variabel awal
        double presentase = 0.0;
        double BonusSertifikasi = 0.0;
        double Komisi = 0.0;
        double total = 0.0;
// Menghitung Komisi
        if (rating < 70) {
            System.out.println("\n Rating dibawah 70 --> Tidak memenuhi syarat untuk komisi." );
        } else {
// Menentukan persentase awal berdasarkan omset
        if (omset < 50000000) {
            presentase = 0.01;
        } else if (omset < 1000000000) {
            presentase = 0.02;
        } else {
            presentase = 0.03;
        }
// Tambahan karena rating tinggi
        if ( rating >=90 ) {
            presentase += 0.01;
        }
//  Bonus Sertifikasi
        if ( Sertifikasi.equals("Ya")) {
            BonusSertifikasi = 500000;
        }
// Hitung komisi dan total
        Komisi = omset * presentase;
        total = Komisi + BonusSertifikasi;
        }
// output
        System.out.println("\n ----- Rincian Komisi -----");
        System.out.println("Omset : Rp  " + omset);
        System.out.println("Rating : " + rating);
        System.out.println("Sertifikasi: " + Sertifikasi);
        System.out.println("Persentase Komisi : " + presentase*100 );
        System.out.println("Jumlah Komisi: Rp " + Komisi);
        System.out.println("Bonus Sertifikasi: Rp" + BonusSertifikasi);
        System.out.println("Total Komisi: Rp " + total);
        sc.close();
    }
}