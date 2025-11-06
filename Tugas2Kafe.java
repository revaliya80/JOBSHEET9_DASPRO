import java.util.Scanner;

public class Tugas2Kafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah pesanan: ");
        int jmlPesan = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[jmlPesan];
        int[] harga = new int[jmlPesan];
        int total = 0;

        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println((i + 1) + ". " + nama[i] + "- Rp " + harga[i]);
        }

        System.out.println("Total biaya :" + total);
        sc.close();
    }
}
