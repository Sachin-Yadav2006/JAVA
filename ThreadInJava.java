import java.lang.Thread;

class thread extends Thread {
    public void run() {
        System.out.println("Running a thread in Java");
    }
}

public class ThreadInJava {
    public static void main(String[] args) {
        thread t = new thread();
        thread t1 = new thread();
        thread t2 = new thread();
        t1.start();
        t.start();
        t2.start();
    }
}
