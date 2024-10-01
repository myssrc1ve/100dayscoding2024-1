import java.math.BigDecimal;

public class ContohReferensiDesimal {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("5.5");
        BigDecimal number2 = new BigDecimal("2.5");

        BigDecimal result = number1.add(number2);

        System.out.println("Hasil penjumlahan: " + result);
    }
}
