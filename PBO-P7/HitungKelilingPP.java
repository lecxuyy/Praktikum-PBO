package PraktikumP7;

class PersegiPanjang {
    double panjang;
    double lebar;

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class HitungKelilingPP {
    public void gasken() {
        System.out.println("=== Soal 2: Hitung Keliling Persegi Panjang ===");
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 12.5;
        pp.lebar = 7.5;

        System.out.println("Panjang  : " + pp.panjang);
        System.out.println("Lebar    : " + pp.lebar);
        System.out.println("Keliling : " + pp.hitungKeliling());
        System.out.println("---------------------------------------------");
    }
}