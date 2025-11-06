import java.util.Scanner;

public class Tugas3Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        System.out.println("=== Daftar Menu Cafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("Masukkan nama makanan yang ingin dicari : ");
        String cari = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu " + cari + " tersedia di kafe.");
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Makanan yang dicari tidak ada di menu");
        }
        sc.close();
    }
}