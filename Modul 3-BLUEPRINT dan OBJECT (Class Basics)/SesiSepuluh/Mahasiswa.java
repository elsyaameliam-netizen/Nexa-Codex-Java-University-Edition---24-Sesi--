public class Mahasiswa {
    String nama;

    // Constructor (Nama method SAMA dengan nama Class)
    public Mahasiswa(String namaInput) {
        this.nama = namaInput;
    }

    public static void main(String[] args) {
        // Error jika kurung kosong: new Mahasiswa(); 
        Mahasiswa m1 = new Mahasiswa("Budi aning"); 
        System.out.println(m1.nama);
    }
}