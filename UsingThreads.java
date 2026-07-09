// Thread allow aprogram to operate more efficiently by doing multiple things at the same time
// can be used to carry out complex tasks in the background without interrupting the main program
/*
Creating threads:
    a. by extending the Thread class and overriding run() method;
    b.by implementing the Runnable interface

to avoid concurrency problems its advised to reduce the amount of shred attributes bttwn threads or using the isAlive() method
*/


public class UsingThreads extends Thread {
    public void run(){
        System.out.println("running a thread");
    }
    public static void main(String[] args) {
        UsingThreads thread = new UsingThreads();
        thread.start();
    }
}

class Main implements Runnable{
//     public static void main(String[] args) {
//     Main obj = new Main();
//     Thread thread = new Thread(obj);
//     thread.start();
//     System.out.println("This code is outside of the thread");
//   }
 public void run(){
        System.out.println("running a thread");
    }   
}