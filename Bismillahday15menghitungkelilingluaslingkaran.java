import java.util.Scanner;

public class Kelilingdanluaslingkaran{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double keliling = 2 * Math.PI * jariJari;
        double luas = Math.PI * jariJari * jariJari;

        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("Luas lingkaran: " + luas);

        scanner.close();
    }
}