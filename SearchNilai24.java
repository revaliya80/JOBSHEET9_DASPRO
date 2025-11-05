import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai :");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang di cari : ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                ditemukan = true;
                System.out.print("Nilai " + key + "ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                break;
            }
        }
        if (!ditemukan) {
            System.out.print("Nilai " + key + "tidak ditemukan dalam data.");
        }
    }
}
