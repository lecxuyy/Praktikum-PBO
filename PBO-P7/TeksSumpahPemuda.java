package PraktikumP7;

class SumpahPemuda {
    SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    void tampilkanTigaSumpah() {
        System.out.println("1. Kami putra dan putri Indonesia, mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("2. Kami putra dan putri Indonesia, mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("3. Kami putra dan putri Indonesia, menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class TeksSumpahPemuda {
    public void gasken() {
        System.out.println("=== Soal 4: Sumpah Pemuda ===");
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanTigaSumpah();
        System.out.println("---------------------------------------------");
    }
}