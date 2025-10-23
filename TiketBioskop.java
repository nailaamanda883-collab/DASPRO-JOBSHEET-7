import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon, setelahdiskon;
        int hari, totalTiket;
        long penjualan;

        
        int totalTiketTerjualHarian = 0;
        double totalHargaJualHarian = 0; 

        do { 
            System.out.print("Masukkan total tiket yang terjual(Masukkan 0 untuk keluar): ");
            totalTiket = sc.nextInt();
            penjualan = totalTiket * 50000;

            
            diskon = 0;
            setelahdiskon = penjualan; 

            if (totalTiket <0){
                System.out.println("Penjualan tidak valid, silahkan masukkan ulang.");
                continue;
            } 
            
            if (totalTiket > 10){
                diskon = penjualan * 0.15;
                setelahdiskon = (penjualan - diskon);
                System.out.println("Anda mendapatkan diskon: " + diskon);
                System.out.println("Harga setelah diskon: " +setelahdiskon);
            }
            else if(totalTiket > 4){
                diskon = penjualan * 0.10;
                setelahdiskon = (penjualan - diskon);
                System.out.println("Anda mendapatkan diskon: " + diskon);
                System.out.println("Harga setelah diskon: " +setelahdiskon);
            }
            else if (totalTiket > 0){
                System.out.println("Anda tidak mendapatkan diskon: " + penjualan);
                System.out.println("Harga setelah diskon: " + setelahdiskon);
            }
            
            
            if (totalTiket > 0) { 
                totalTiketTerjualHarian += totalTiket;
                totalHargaJualHarian += setelahdiskon;
            }
            
            
            else if(totalTiket == 0){
                break;
            }

        } while (true);
        
        
        System.out.println("\n==============================================");
        System.out.println("        RINGKASAN PENJUALAN TIKET HARI INI      ");
        System.out.println("==============================================");
        System.out.println("Total Keseluruhan Tiket Terjual: " + totalTiketTerjualHarian + " tiket");
        System.out.printf("Total Keseluruhan Harga Jual (Setelah Diskon): Rp %.0f\n", totalHargaJualHarian);
        System.out.println("==============================================");

        sc.close();
    }
}