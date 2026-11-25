package PraktikumP6;

public class Mobil {
    public void jalankan() {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        mobil[1] = "Toyota";
        System.out.println("Nilai baru pada indeks ke-1 adalah: " + mobil[1]);
    }
}