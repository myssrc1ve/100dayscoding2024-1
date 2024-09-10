public class Variabel_konstanta {
    public static void main(String[] args) {
        // Deklarasi variabel
        int umur = 21; // variabel umur dengan tipe data integer
        double tinggi = 170.5; // variabel tinggi dengan tipe data double
        String nama = "Afgan"; // variabel nama dengan tipe data String

        // Deklarasi konstanta
        final double PI = 3.14159; // konstanta PI dengan tipe data double
        final int Maksimal_UMUR = 100; // konstanta Maksimal_UMUR dengan tipe data integer

        // Menampilkan nilai variabel
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);

        // Menampilkan nilai konstanta
        System.out.println("Nilai PI: " + PI);
        System.out.println("Maksimal_UMUR: " + Maksimal_UMUR);

        // Mengubah nilai variabel
        umur = 30; // nilai variabel umur diubah
        tinggi = 175.0; // nilai variabel tinggi diubah
        // Maksimal_UMUR = 110; // baris ini akan menyebabkan error karena Maksimal_UMUR adalah konstanta

        // Menampilkan nilai variabel yang telah diubah
        System.out.println("Umur baru: " + umur);
        System.out.println("Tinggi baru: " + tinggi);
    }
}
