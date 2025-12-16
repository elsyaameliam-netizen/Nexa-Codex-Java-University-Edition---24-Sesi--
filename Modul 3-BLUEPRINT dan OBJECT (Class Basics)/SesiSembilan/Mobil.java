public class Mobil {
    // Atribut (Variables)
    String warna;
    int tahun;
    String merek; // TUGAS: Atribut baru ditambahkan

    // Method (Behavior)
    void jalan() {
        // Saya update sedikit print-nya agar menampilkan Merek juga
        System.out.println("Mobil " + merek + " (" + warna + ") sedang berjalan... Brum!");
        // System.out.println("Tahun: " + tahun);
    }
}