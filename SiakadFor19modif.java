import java.util.Scanner;

public class SiakadFor19modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        System.out.println("Masukkan nilai 10 mahasiswa:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();

            // menentukan nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // menentukan lulus / tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\nNilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);
        System.out.println("Jumlah mahasiswa lulus       = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + tidakLulus);

        input.close();
    }
}
