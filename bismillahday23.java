public class ContohReferensiLong {
    public static void main(String[] args) {
        Long angkaLong = 5000L; // Tipe data referensi Long
        System.out.println("Nilai awal angkaLong: " + angkaLong);
        
        angkaLong = tambahkanNilai(angkaLong); // Mengupdate nilai
        System.out.println("Nilai setelah ditambahkan: " + angkaLong);
    }

    // Metode untuk menambah nilai
    public static Long tambahkanNilai(Long nilai) {
        return nilai + 250; // Menambahkan 250
    }
}