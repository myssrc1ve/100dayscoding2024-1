import java.util.Scanner;

public class inputancharsederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan sebuah karakter: ");
        char inputChar = scanner.next().charAt(0);

        // Menampilkan karakter yang dimasukkan
        System.out.println("Karakter yang dimasukkan: " + inputChar);

        // Menutup scanner
        scanner.close();
    }
}