import java.util.Scanner; // Meminjam alat Scanner

public class SesiEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Menyalakan mikrofon

        System.out.print("Siapa namamu? ");
        String nama = input.nextLine(); // Menunggu user mengetik

        System.out.print("Umur berapa? ");
        int umur = input.nextInt(); // Menunggu angka

        System.out.println("Halo " + nama + ", tahun depan umurmu " + (umur + 1));

        input.close(); // Matikan mikrofon
    }
}