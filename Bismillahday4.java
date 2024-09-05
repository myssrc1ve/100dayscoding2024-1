import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        System.out.print("Nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Umur Anda: ");
        int umur = scanner.nextInt();

        // Menampilkan hasil
        System.out.printf("Nama Anda adalah %s dan umur Anda adalah %d tahun.\n", nama, umur);

        scanner.close();
    }
}
