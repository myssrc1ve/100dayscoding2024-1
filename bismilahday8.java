import java.util.ArrayList;

public class contohUpdate {
    public static void main(String[] args) {
        
        ArrayList<String> namaBarang = new ArrayList<>();
        namaBarang.add("Barang A");
        namaBarang.add("Barang B");
        System.out.println("Sebelum update: " + namaBarang);

       
        namaBarang.set(0, "Barang A mengupdate");

        // Menampilkan daftar nama barang setelah update
        System.out.println("Setelah update: " + namaBarang);
    }
}
