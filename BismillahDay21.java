public class TipedataReferensiInteger {
    public static void main(String[] args) {
        Integer angka = 10;  // Integer sebagai reference
        System.out.println("Nilai awal: " + angka);
        
        angka = ubahNilai(angka);  // Mengubah nilai objek
        System.out.println("Nilai setelah ubahNilai: " + angka);
    }

    public static Integer ubahNilai(Integer angka) {
        return angka + 10;  // Mengembalikan nilai baru
    }
}