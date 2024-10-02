public class KonversiString {

    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "45.67";
        String strBoolean = "true";

        int intValue = Integer.parseInt(strInt);
        System.out.println("Konversi String ke int: " + intValue);

        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("Konversi String ke double: " + doubleValue);

        boolean booleanValue = Boolean.parseBoolean(strBoolean);
        System.out.println("Konversi String ke boolean: " + booleanValue);
    }
}
