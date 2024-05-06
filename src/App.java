import java.util.concurrent.Semaphore;

import Philosopher.Philosopher;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore f1 = new Semaphore(1);
        Semaphore f2 = new Semaphore(1);
        Semaphore f3 = new Semaphore(1);
        Semaphore f4 = new Semaphore(1);
        Semaphore f5 = new Semaphore(1);

        Philosopher p1 = new Philosopher("p1", f1, f2);
        Philosopher p2 = new Philosopher("p2", f2, f3);
        Philosopher p3 = new Philosopher("p3", f3, f4);
        Philosopher p4 = new Philosopher("p4", f4, f5);
        Philosopher p5 = new Philosopher("p5", f5, f1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

// //--------------------------Garfo invertido-----------------------------------------------------------

// import java.util.concurrent.Semaphore;

// import Philosopher.Philosopher;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Semaphore f1 = new Semaphore(1);
//         Semaphore f2 = new Semaphore(1);
//         Semaphore f3 = new Semaphore(1);
//         Semaphore f4 = new Semaphore(1);
//         Semaphore f5 = new Semaphore(1);

//         Philosopher p1 = new Philosopher("p1", f1, f2);
//         Philosopher p2 = new Philosopher("p2", f2, f3);
//         Philosopher p3 = new Philosopher("p3", f3, f4);
//         Philosopher p4 = new Philosopher("p4", f4, f5);
//         Philosopher p5 = new Philosopher("p5", f1, f5);

//         Thread t1 = new Thread(p1);
//         Thread t2 = new Thread(p2);
//         Thread t3 = new Thread(p3);
//         Thread t4 = new Thread(p4);
//         Thread t5 = new Thread(p5);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
//     }
// }

//--------------------------Saleiro-----------------------------------------------------------

// import java.util.concurrent.Semaphore;

// import Philosopher.Philosopher;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Semaphore f1 = new Semaphore(1);
//         Semaphore f2 = new Semaphore(1);
//         Semaphore f3 = new Semaphore(1);
//         Semaphore f4 = new Semaphore(1);
//         Semaphore f5 = new Semaphore(1);
        
//         Semaphore salt = new Semaphore(4);
        
//         Philosopher p1 = new Philosopher("p1", f1, f2, salt);
//         Philosopher p2 = new Philosopher("p2", f2, f3, salt);
//         Philosopher p3 = new Philosopher("p3", f3, f4, salt);
//         Philosopher p4 = new Philosopher("p4", f4, f5, salt);
//         Philosopher p5 = new Philosopher("p5", f5, f1, salt);

//         Thread t1 = new Thread(p1);
//         Thread t2 = new Thread(p2);
//         Thread t3 = new Thread(p3);
//         Thread t4 = new Thread(p4);
//         Thread t5 = new Thread(p5);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
//     }
// }
