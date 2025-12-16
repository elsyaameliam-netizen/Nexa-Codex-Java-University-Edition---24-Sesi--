public class SesiLima {
    public static void main(String[] args) {
        int nilai = 75;
        int kkm = 70;

        if (nilai > kkm) {
            System.out.println("Lulus! Selamat.");
        } else if (nilai == kkm) {
            System.out.println("Lulus pas-pasan (Hampir!).");
        } else {
            System.out.println("Remedial.");
        }
    }
}