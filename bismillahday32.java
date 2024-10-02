public class KonversiDataPrimitif {
    public static void main(String[] args) {
        int angka = 42;
        boolean bolean = false;

        String stringAngka = Integer.toString(angka);
        String stringBolean = Boolean.toString(bolean);

        System.out.println("Integer ke String: " + stringAngka);
        System.out.println("Boolean ke String: " + stringBolean);
    }
}
