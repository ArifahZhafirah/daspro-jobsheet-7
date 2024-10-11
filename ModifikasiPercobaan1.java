// import java.util.Scanner;

// public class SiakadFor04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         double nilai, tertinggi = 0, terendah = 100;

//         for (int i = 1; i <= 10; i++) {
//             System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
//             nilai = sc.nextDouble();
//             if (nilai > tertinggi) {
//                 tertinggi = nilai;
//             }
//             if (nilai < terendah) {
//                 terendah = nilai;
//             } 
//         }
//         System.out.println("Nilai tertinggi: " + tertinggi);
//         System.out.println("Nilai terendah: " + terendah);
//     }
// }

import java.util.Scanner;

public class ModifikasiPercobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            while (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100:");
                nilai = sc.nextDouble();
            }
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        
        sc.close(); 
    }
}