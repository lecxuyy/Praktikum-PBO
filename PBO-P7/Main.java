package PraktikumP7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MekanismeObjek s1 = new MekanismeObjek();
        HitungKelilingPP s2 = new HitungKelilingPP();
        MenebakTTL s3 = new MenebakTTL();
        TeksSumpahPemuda s4 = new TeksSumpahPemuda();
        Rekursif s5 = new Rekursif();
        CivitasAkademika s6 = new CivitasAkademika();
        DataDiriMhs s7 = new DataDiriMhs();

        s1.gasken();
        s2.gasken();
        s3.gasken();
        s4.gasken();
        s5.gasken();
        s6.gasken();
        s7.gasken(input);

        input.close();
    }
}