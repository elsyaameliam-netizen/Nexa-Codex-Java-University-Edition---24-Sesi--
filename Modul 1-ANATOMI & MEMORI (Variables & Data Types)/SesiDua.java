public class SesiDua {
    public static void main(String[] args) {
        String namaBarang = "Laptop Gaming";
        int stok = 5;
        double harga = 15000.99; // Pakai titik bukan koma
        boolean tersedia = true;

        // Bedah: Apa yang terjadi jika baris di bawah di-uncomment?
        // int stokPalsu = "Banyak"; 

        System.out.println("Barang: " + namaBarang);
        System.out.println("Total Aset: " + (stok * harga));
    }
}