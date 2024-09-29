public class Main {
    public static void main(String[] args) {
        Boolean sedangHujan = true;
        Boolean akhirPekan = false;
        
        Boolean bawaPayung = sedangHujan || !akhirPekan;
        
        if (bawaPayung) {
            System.out.println("Seseorang akan membawa payung.");
        } else {
            System.out.println("Seseorang tidak akan membawa payung.");
        }
    }
}
