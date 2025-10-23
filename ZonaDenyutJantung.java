import java.util.Scanner;

public class ZonaDenyutJantung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan usia Anda (tahun): ");
        int usia = input.nextInt();
        System.out.print("Masukkan detak jantung saat latihan (HR): ");
        int hr = input.nextInt();
        
        // Validasi input
        if (usia < 10 || usia > 100) {
            System.out.println("Usia tidak masuk akal! (harus antara 10-100 tahun)");
            return;
        }
        if (hr <= 0) {
            System.out.println("Detak jantung harus positif!");
            return;
        }
        
        // Hitung MHR dan %MHR
        int mhr = 220 - usia;
        double persenMhr = (double) hr / mhr * 100;
        
        // Tentukan kategori intensitas
        String kategori;
        String saran;
        
        if (persenMhr < 50) {
            kategori = "Sangat ringan";
            saran = "Pemanasan, manfaat minimal.";
        } else if (persenMhr < 60) {
            kategori = "Ringan";
            saran = "Peningkatan dasar kebugaran.";
        } else if (persenMhr < 70) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman.";
        } else if (persenMhr <= 85) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi.";
        } else {
            kategori = "Sangat berat";
            saran = "Berisiko bagi pemula, batasi durasi.";
        }
        
        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("MHR (Maksimum Heart Rate) : " + mhr + " bpm");
        System.out.println("%MHR                     : " + Math.round(persenMhr) + "%");
        System.out.println("Kategori Intensitas      : " + kategori);
        System.out.println("Saran                    : " + saran);
    }
}
