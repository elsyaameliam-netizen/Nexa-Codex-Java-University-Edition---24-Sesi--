public class Main {
    public static void main(String[] args) {
        // --- OBJECT 1: MOBIL SAYA ---
        Mobil mobilSaya = new Mobil(); // Membuat Object nyata
        
        // Mengisi atribut
        mobilSaya.warna = "Merah";
        mobilSaya.tahun = 2020;
        mobilSaya.merek = "Toyota"; // Mengisi atribut merek
        
        // Menjalankan method
        System.out.println("--- Info Mobil Saya ---");
        mobilSaya.jalan();
        System.out.println("Tahun: " + mobilSaya.tahun);


        // --- OBJECT 2: MOBIL TEMAN (MISI) ---
        Mobil mobilTeman = new Mobil(); // Membuat Object kedua dari cetakan yang sama
        
        // Mengisi atribut
        mobilTeman.warna = "Biru";      // Sesuai Misi
        mobilTeman.tahun = 2023;
        mobilTeman.merek = "Honda";     // Mengisi atribut merek
        
        // Menjalankan method
        System.out.println("\n--- Info Mobil Teman ---");
        mobilTeman.jalan();
    }
}