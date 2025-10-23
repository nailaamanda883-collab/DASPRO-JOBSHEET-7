import java.util.Scanner;

public class BayarParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis;
        int durasi;
        int total = 0;

        System.out.println("Masukkan jenis (1 Mobil, 2 Motor, 0 Keluar):");
        jenis = sc.nextInt(); 

        while (jenis != 0) {
            
            
            if (jenis == 1 || jenis == 2) {
                
                System.out.print("Durasi (jam): ");
                durasi = sc.nextInt();

                
                if (durasi > 5) {
                    
                    total += 12500;
                } else {
                    
                    if (jenis == 1) { 
                        total += durasi * 3000;
                    } else { 
                        total += durasi * 2000;
                    }
                }
            } else {
                
                System.out.println("Pilihan tidak valid.");
            }
            
            
            System.out.print("Jenis berikutnya (0 untuk Keluar): ");
            jenis = sc.nextInt();
        }

        
        System.out.println("\nTotal: " + total);
        sc.close();
    }
}