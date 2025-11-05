import java.util.Scanner;

public class Tugas1NilaiMhs24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa yang akan di input :");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print(" Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata2 = total / jumlah;
        System.out.println("Rata-rata nilai mahasiswa : " + rata2);

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        System.out.println("\n=== Nilai Mahasiswa ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }

        System.out.println("\nNIlai rata-rata :" + rata2);
        System.out.println("Nilai tertinggi :" + nilaiTertinggi);
        System.out.println("Nilai terendah :" + nilaiTerendah);

        sc.close();
    }
}
