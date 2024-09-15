import java.util.Scanner;

public class LuasPanjangPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang (cm): ");
        double panjang = scanner.nextDouble();
        
        System.out.print("Masukkan lebar persegi panjang (cm): ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.printf("Panjang: %.2f cm\n", panjang);
        System.out.printf("Lebar: %.2f cm\n", lebar);
        System.out.printf("Luas: %.2f cm^2\n", luas);
        System.out.printf("Keliling: %.2f cm\n", keliling);

        scanner.close();
    }
}