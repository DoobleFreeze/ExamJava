package Task23;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this); // Создать новый поток исполнения
        t.start(); // Запустить поток исполнения
    }

    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new NewThread();
        new NewThread();
        new NewThread();
    }
}
