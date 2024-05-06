// // package Philosopher;

// // import java.util.Random;
// // import java.util.concurrent.Semaphore;
// // import java.util.concurrent.TimeUnit;

// // public class Philosopher implements Runnable {

// //     private String name;
// //     private Semaphore f_left;
// //     private Semaphore f_right;
// //     private boolean has_thinked;

// //     public Philosopher(String name, Semaphore f_left, Semaphore f_right) {
// //         this.name = name;
// //         this.f_left = f_left;
// //         this.f_right = f_right;
// //         this.has_thinked = false;
// //     }

// //     @Override
// //     public void run() {
// //         while (true) {
// //             try {
// //                 if(!this.has_thinked){
// //                     think();
// //                 }

// //                 f_left.acquire();
// //                 System.out.println(this.name + " get left!");
                
// //                 if(f_right.tryAcquire()){

// //                     System.out.println(this.name + " get both!");
// //                     System.out.println(this.name + " ate!");
                    
// //                     // Thread.sleep(new Random(45).nextInt(0, 200));
// //                     System.out.println(this.name + " released the forks!");
// //                     f_left.release();
// //                     f_right.release();
                    
// //                     this.has_thinked = false;
                    
// //                 }else{
                    
// //                     System.out.println(this.name + " released left!");
// //                     f_left.release();
// //                 }
// //             } catch (InterruptedException e) {
// //                 break;
// //             }
// //         }
// //     }
    
// //     private void think() throws InterruptedException{
// //         // Thread.sleep(1000);
// //         System.out.println(name + " thinked!");
// //         this.has_thinked = true;
// //     }
// // }

// package Philosopher;

// import java.util.Random;
// import java.util.concurrent.Semaphore;
// import java.util.concurrent.TimeUnit;

// public class Philosopher implements Runnable {

//     private String name;
//     private Semaphore f_left;
//     private Semaphore f_right;
//     private Semaphore salt;
//     private boolean has_thinked;

//     public Philosopher(String name, Semaphore f_left, Semaphore f_right, Semaphore salt) {
//         this.name = name;
//         this.f_left = f_left;
//         this.f_right = f_right;
//         this.salt = salt;
//         this.has_thinked = false;
//     }

//     @Override
//     public void run() {
//         while (true) {
//             try {
//                 if(!this.has_thinked){
//                     think();
//                 }

//                 salt.acquire();
                
//                 f_left.acquire();
//                 System.out.println(this.name + " get left!");
                
//                 f_right.acquire(); // Changed from f_right.tryAcquire() to f_right.acquire()
                
//                 System.out.println(this.name + " get both!");
//                 System.out.println(this.name + " ate!");
                
//                 // Thread.sleep(new Random(45).nextInt(0, 200));
//                 System.out.println(this.name + " released the forks!");
//                 f_left.release();
//                 f_right.release();
//                 salt.release();

//                 this.has_thinked = false;
                
//             } catch (InterruptedException e) {
//                 break;
//             }
//         }
//     }
    
//     private void think() throws InterruptedException{
//         // Thread.sleep(1000);
//         System.out.println(name + " thinked!");
//         this.has_thinked = true;
//     }
// }

// package Philosopher;

// import java.util.Random;
// import java.util.concurrent.Semaphore;
// import java.util.concurrent.TimeUnit;

// public class Philosopher implements Runnable {

//     private String name;
//     private Semaphore f_left;
//     private Semaphore f_right;
//     private boolean has_thinked;

//     public Philosopher(String name, Semaphore f_left, Semaphore f_right) {
//         this.name = name;
//         this.f_left = f_left;
//         this.f_right = f_right;
//         this.has_thinked = false;
//     }

//     @Override
//     public void run() {
//         while (true) {
//             try {
//                 if(!this.has_thinked){
//                     think();
//                 }

//                 f_left.acquire();
//                 System.out.println(this.name + " get left!");
                
//                 if(f_right.tryAcquire()){

//                     System.out.println(this.name + " get both!");
//                     System.out.println(this.name + " ate!");
                    
//                     // Thread.sleep(new Random(45).nextInt(0, 200));
//                     System.out.println(this.name + " released the forks!");
//                     f_left.release();
//                     f_right.release();
                    
//                     this.has_thinked = false;
                    
//                 }else{
                    
//                     System.out.println(this.name + " released left!");
//                     f_left.release();
//                 }
//             } catch (InterruptedException e) {
//                 break;
//             }
//         }
//     }
    
//     private void think() throws InterruptedException{
//         // Thread.sleep(1000);
//         System.out.println(name + " thinked!");
//         this.has_thinked = true;
//     }
// }

package Philosopher;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {

    private String name;
    private Semaphore f_left;
    private Semaphore f_right;
    private boolean has_thinked;

    public Philosopher(String name, Semaphore f_left, Semaphore f_right) {
        this.name = name;
        this.f_left = f_left;
        this.f_right = f_right;
        this.has_thinked = false;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if(!this.has_thinked){
                    think();
                }

                
                f_left.acquire();
                System.out.println(this.name + " get left!");
                
                f_right.acquire(); // Changed from f_right.tryAcquire() to f_right.acquire()
                
                System.out.println(this.name + " get both!");
                System.out.println(this.name + " ate!");
                
                // Thread.sleep(new Random(45).nextInt(0, 200));
                System.out.println(this.name + " released the forks!");
                f_left.release();
                f_right.release();

                this.has_thinked = false;
                
            } catch (InterruptedException e) {
                break;
            }
        }
    }
    
    private void think() throws InterruptedException{
        // Thread.sleep(1000);
        System.out.println(name + " thinked!");
        this.has_thinked = true;
    }
}