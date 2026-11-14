package PraktikumP6;

class ThreadBaru extends Thread {
    
    public void run() {
        System.out.println("Thread baru berjalan! (" + Thread.currentThread().getName() + ")");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses ke-" + i + " di dalam method run()");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu: " + e.getMessage());
            }
        }
    }
}

public class MewarisiThread {
    public void jalankan() {
        ThreadBaru objekThread = new ThreadBaru();
        objekThread.start();
    }
}