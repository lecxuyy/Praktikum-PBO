package PraktikumP6;

public class Perulangan {
    public void jalankan() {
        int[] age = {12, 4, 5, 2, 6};

        // Perulangan 1: For Loop biasa (berbasis indeks)
        System.out.println("1. Menampilkan array menggunakan For Loop biasa:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("   Indeks ke-" + i + " = " + age[i]);
        }

        // Perulangan 2: For-Each Loop (Enhanced For Loop)
        System.out.println("\n2. Menampilkan array menggunakan For-Each Loop:");
        for (int nilai : age) {
            System.out.println("   Nilai = " + nilai);
        }
    }
}