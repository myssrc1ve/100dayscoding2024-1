public class referenceCharacter{
    public static void main(String[] args) {
        Character huruf1 = 'A';
        Character huruf2 = 'B';

        System.out.println("Karakter 1: " + huruf1);
        System.out.println("Karakter 2: " + huruf2);
        System.out.println("Apakah huruf1 adalah huruf? " + Character.isLetter(huruf1));
        System.out.println("Huruf1 dalam huruf kecil: " + Character.toLowerCase(huruf1));
    }
}
