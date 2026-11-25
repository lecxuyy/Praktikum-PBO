package PraktikumP7;

class MatematikaRekursif {
    int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
}

public class Rekursif {
    public void gasken() {
        System.out.println("=== Soal 5: Method Rekursif ===");
        MatematikaRekursif mr = new MatematikaRekursif();
        int angka = 5;

        System.out.println(angka + "! = " + mr.faktorial(angka));
        System.out.println("---------------------------------------------");
    }
}