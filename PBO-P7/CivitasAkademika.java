package PraktikumP7;

class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status + " - Fakultas Teknik");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class CivitasAkademika {
    public void gasken() {
        System.out.println("=== Soal 6: Civitas Akademika Fakultas Teknik ===");
        Dosen d = new Dosen("Umuh Muchtar");
        Mahasiswa m = new Mahasiswa("Aditya Pratama");
        Staff s = new Staff("Igor Tolic");

        d.tampilkanInfo();
        System.out.println();
        m.tampilkanInfo();
        System.out.println();
        s.tampilkanInfo();
        System.out.println("---------------------------------------------");
    }
}