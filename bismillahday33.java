public class contohCasting {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt;
        
        double anotherDouble = 9.99;
        int anotherInt = (int) anotherDouble;
        
        System.out.println("Nilai int: " + myInt);
        System.out.println("Nilai double: " + myDouble);
        System.out.println("Nilai double yang di-cast ke int: " + anotherInt);
    }
}
