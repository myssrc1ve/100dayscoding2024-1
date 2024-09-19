import java.util.Scanner;

public class tipedataboolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        System.out.println(scanner.nextInt() % 2 == 0 ? "Genap" : "Ganjil");
        scanner.close();
    }
}