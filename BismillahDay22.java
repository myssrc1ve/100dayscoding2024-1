public class KonversiShort {
    public static void main(String[] args) {
        String strAngka = "25";
        Short angka = Short.parseShort(strAngka);
        System.out.println("Nilai dari objek Short: " + angka);
        Short hasil = (short) (angka + 10);
        System.out.println("Nilai setelah ditambah 10: " + hasil);
    }
}