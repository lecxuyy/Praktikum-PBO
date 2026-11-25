package PraktikumP6;

public class SintaksMenampung {
    public void jalankan() {
        // Menggunakan array Object[] untuk menampung int, double, char, String, dan boolean sekaligus
        Object[] dataCampuran = {19, 0.2, 'C', "Java", true};

        System.out.println("Isi array dataCampuran beserta tipe datanya:");
        for (int i = 0; i < dataCampuran.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + dataCampuran[i]
                + " \t(Tipe: " + dataCampuran[i].getClass().getSimpleName() + ")");
        }
    }
}    