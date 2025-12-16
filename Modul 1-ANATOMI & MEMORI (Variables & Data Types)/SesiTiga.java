public class SesiTiga {
    public static void main(String[] args) {
        int uangSaya = 10000;
        int hargaPermen = 3000;

        int dapatPermen = uangSaya / hargaPermen; 
        int sisaUang = uangSaya % hargaPermen; // Operator Modulus (Sisa Bagi)

        System.out.println("Dapat: " + dapatPermen + " permen");
        System.out.println("Kembalian: " + sisaUang);

        // Misi: Kenapa hasilnya 3, bukan 3.333? 
        // (Karena tipe datanya int/bulat!)
    }
}