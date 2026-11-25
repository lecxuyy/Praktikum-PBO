package PraktikumP7;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void infoBuku() {
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}

public class MekanismeObjek {
    public void gasken() {
        System.out.println("=== Soal 1: Mekanisme Kelas Menjadi Objek ===");
        
        Buku b1 = new Buku("Dasar Pemrograman Java", "Andi Pratama");
        Buku b2 = new Buku("Struktur Data & Algoritma", "Rina Kusuma");

        b1.infoBuku();
        System.out.println("---------------------------------------------");
        b2.infoBuku();
        System.out.println("---------------------------------------------");
    }
}