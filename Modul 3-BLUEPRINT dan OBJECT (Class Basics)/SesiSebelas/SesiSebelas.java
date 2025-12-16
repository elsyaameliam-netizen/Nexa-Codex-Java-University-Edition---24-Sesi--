

public class SesiSebelas {
    public static void main(String[] args) {
        Kucing oyen = new Kucing();
        oyen.meong();
        oyen.makan(); // Bisa makan padahal tidak ditulis di class Kucing!
    }
}
class Hewan {
    void makan() { System.out.println("Nyam nyam..."); }
}

// Kucing mewarisi kemampuan Hewan
class Kucing extends Hewan {
    void meong() { System.out.println("Meooong!"); }
}