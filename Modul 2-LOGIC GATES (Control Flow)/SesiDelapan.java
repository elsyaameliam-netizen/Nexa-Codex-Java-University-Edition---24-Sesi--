public class SesiDelapan {
    public static void main(String[] args) {
        int baterai = 10;

        while (baterai > 0) {
            System.out.println("Nyala... Baterai: " + baterai + "%");
            baterai = baterai - 2; // Baterai berkurang
        }
        System.out.println("Mati Total.");
    }
}