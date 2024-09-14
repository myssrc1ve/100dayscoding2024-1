public class TipeData {
    public static void main(String[] args) {
        // Tipe data primitif
        byte umur = 21;
        short tahunMasuk = 2020;
        int angkaKesukaan = 99;
        long nomorTelepon = 628123456789L;
        float ipk = 3.75f;
        double tinggiBadan = 170.5;
        char inisial = 'A';
        boolean statusMahasiswa = true;

        // Tipe data non-primitif
        String nama = "Afgan";
        String nimLengkap = "D0222328";
        String alamat = "Jl. Poros Majene Totolisi";

        // Output dari semua tipe data
        System.out.println("Nama: " + nama);
        System.out.println("Inisial: " + inisial);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Angka Kesukaan: " + angkaKesukaan);
        System.out.println("NIM lengkap: " + nimLengkap);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("IPK: " + ipk);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Status mahasiswa: " + (statusMahasiswa ? "Masih mahasiswa" : "Sudah lulus"));
        System.out.println("Alamat: " + alamat);
    }
}