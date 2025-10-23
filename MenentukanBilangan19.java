import java.util.Scanner;
public class MenentukanBilangan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// input tiga bilangan
    int a;
    int b;
    int c;
    System.out.println("Masukkan bilangan A: ");
    a = sc.nextInt();
    System.out.println("Masukkan bilangan B: ");
    b = sc.nextInt();
    System.out.println("Masukkan bilangan C: ");
    c = sc.nextInt();
// Menentukan hasil
    if (a == b && b == c) {
        System.out.println("Ketiga bilangan sama besar: " + a);
    } else if ( a == b || a == c || b == c) {
        System.out.println("Ada dua bilangan yang sama besar: ");
    } else {
        int terbesar;
        if (a > b && a > c) {
            terbesar = a;
        } else if (b > a && b > c) {
            terbesar = b;
        } else {
            terbesar = c;
        }
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
    sc.close();

    }
}