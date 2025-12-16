public class SesiEnam {
    public static void main(String[] args) {
        int pilihan = 2;

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break; // Stop, jangan baca bawahnya
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            default:
                System.out.println("Menu tidak ada!");
        }
    }
}