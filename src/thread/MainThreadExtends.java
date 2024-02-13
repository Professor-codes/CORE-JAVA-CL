package thread;

// USING THREAD CLASS
class MyThread1 extends Thread {
    // RUN METHOD
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Thread 1 is running...");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    // RUN METHOD
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Thread 2 is running...");
            i++;
        }
    }
}

public class MainThreadExtends {
    public static void main(String[] args) {
        // OBJECTS
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        // START METHOD
        obj1.start();
        obj2.start();
    }
}
