public class Main {
    public static void main(String[] args) {
        // println ini fungsinya untuk mencetak garis atas tabel
        System.out.println("+---------------------+------+------------+");
        System.out.println("| Nama Karakter       | Umur | Klan       |");
        System.out.println("+---------------------+------+------------+");

        // Jadi  printf disini untuk mencetak setiap baris tabel 
        System.out.printf("| %-19s | %-4d | %-10s |\n", "Naruto Uzumaki", 17, "Uzumaki");
        System.out.printf("| %-19s | %-4d | %-10s |\n", "Sasuke Uchiha", 17, "Uchiha");
        System.out.printf("| %-19s | %-4d | %-10s |\n", "Sakura Haruno", 17, "Haruno");
        System.out.printf("| %-19s | %-4d | %-10s |\n", "Kakashi Hatake", 29, "Hatake");
        System.out.printf("| %-19s | %-4d | %-10s |\n", "Hinata Hyuga", 17, "Hyuga");

        // sedangkan println untuk mencetak garis bawah tabel
        System.out.println("+---------------------+------+------------+");
    }
}
