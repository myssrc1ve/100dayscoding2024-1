import java.util.Scanner;

public class contohString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("String yang dimasukkan: " + inputString);
        
        int length = inputString.length();
        System.out.println("Panjang string: " + length);
        
        String upperCaseString = inputString.toUpperCase();
        System.out.println("String dalam huruf kapital: " + upperCaseString);
        
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("String dalam huruf kecil: " + lowerCaseString);
        
        scanner.close();
    }
}