import java.util.Scanner;

public class InputSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.println("Halo, " + nama + "! Selamat datang.");
        
        scanner.close();
    }
}
