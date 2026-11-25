package PraktikumP7;

class TrikLahir {
    int hitungKodeLahir(int bulan, int tanggal) {
        int hasil = ((bulan * 2 + 5) * 50 + tanggal) - 250;
        return hasil;
    }
}

public class MenebakTTL {
    public void gasken() {
        System.out.println("=== Soal 3: Trik Menebak Tahun dan Tanggal Lahir ===");
        TrikLahir trik = new TrikLahir();

        int bulan = 1;
        int tanggal = 14;
        int hasilAkhir = trik.hitungKodeLahir(bulan, tanggal);

        System.out.println("Input Bulan   : " + bulan);
        System.out.println("Input Tanggal : " + tanggal);
        System.out.println("Hasil Akhir   : " + hasilAkhir);
        System.out.println("---------------------------------------------");
    }
}