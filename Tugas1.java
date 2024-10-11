import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis != 1 && jenis != 2 && jenis != 0) {
                System.out.println("Kode jenis kendaraan tidak valid. Coba lagi.");
                continue; 
            } else if (jenis == 0) {
                continue;
            }

            System.out.print("Masukkan durasi (dalam jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }

        } while (jenis != 0);
        System.out.println("\nTotal yang harus dibayar: " + total);
    }
}