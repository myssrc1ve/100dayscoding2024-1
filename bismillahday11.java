public class MentormodeSeriusday11 {
    public static void main(String[] args) {
        // print untuk tiap variabel nya dengan format. Lalu update nilai dari beberapa variabel. Catatan tiap line program berikan komen yang menjelaskan tiap baris nya
        //Deklarasi variabel var1 dan var2 tanpa inisialisasi  Dengan tipe data int,byte
        //
        int var1;
        byte var2;

        // Inisialisasi variabel var1 dan var2 dibuat inisilisasinya  karena soalnya menyuruh print untuk tiap variabel nya dengan format
        var1 = 10; // kuberi nilai 10 di var1
        var2 = 20; // kuberi nilai 20 di var2

        // lakukan inisialisasi variabel sebanyak 3 dengan nama var3, var4,var5,dengan tipe data short,string, final
        short var3 = 30; // Deklarasi var3 bertipe short dengan nilai 30
        String var4 = "bebasji"; // Deklarasi var4 bertipe String dengan nilai "bebasji"
        final int var5 = 50; // Deklarasi yang var5 bertipe int yang nilainya 50 dan bersifat final (tidak bisa diubah)

        // Mencetak nilai semua variabel
        System.out.println("Nilai var1: " + var1); // Cetak nilai var1
        System.out.println("Nilai var2: " + var2); // Cetak nilai var2
        System.out.println("Nilai var3: " + var3); // Cetak nilai var3
        System.out.println("Nilai var4: " + var4); // Cetak nilai var4
        System.out.println("Nilai var5: " + var5); // Cetak nilai var5

        // Update nilai dari var1, var2, dan var3
        var1 = 15; // nilai var1 diubah nilainya menjadi 15
        var2 = 25; // nilai var2 diubah nilainya menjadi 25
        var3 = 35; // nilai var3 diubah nilainya menjadi 35

        // Print nilai variabel setelah diupdate
        System.out.println("Nilai var1 setelah update: " + var1); // Cetak nilai var1 setelah update
        System.out.println("Nilai var2 setelah update: " + var2); // Cetak nilai var2 setelah update
        System.out.println("Nilai var3 setelah update: " + var3); // Cetak nilai var3 setelah update
    }
}
