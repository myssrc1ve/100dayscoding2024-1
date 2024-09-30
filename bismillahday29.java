import java.math.BigInteger;

public class contohBigInteger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1000000000000000"); 
        BigInteger num2 = new BigInteger("2000000000000000"); 
        BigInteger sum = num1.add(num2);
        System.out.println("Jumlah: " + sum);
    }
}
