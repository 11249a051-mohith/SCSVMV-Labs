//Aim:
To write a Java program to demonstrate multithreading using yield(), sleep(), and break.

//Algorithm:
Start the program.
Create three threads: A, B, and C.
Use yield() in thread A to give other threads a chance to execute.
Use break in thread B to stop its loop when j == 3.
Use sleep(1500) in thread C to pause execution for 1.5 seconds.
Start all three threads using start().
Display the thread outputs.
Stop the program.

//program:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                Thread.yield();

            System.out.println("from thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C k=" + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("C interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
        System.out.println("exit from C");
    }
}

public class CreatingsimpleThread  {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

//Result:
The program successfully demonstrates multithreading and the use of yield(), sleep(), and break in Java.
