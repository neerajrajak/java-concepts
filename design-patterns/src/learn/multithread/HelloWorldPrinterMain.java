package learn.multithread;

public class HelloWorldPrinterMain {

    public static void main(String[] args) {
        System.out.println("Hello World from: "+ Thread.currentThread().getName());
        System.out.println("Thread Group: "+ Thread.currentThread().getThreadGroup().getName());
        System.out.println("Thread Group Parent: "+ Thread.currentThread().getThreadGroup().getParent().getName());
        HelloWorldPrinter hlp = new HelloWorldPrinter();
        Thread t1 = new Thread(hlp);
        Thread t2 = new Thread(hlp);
        Thread t3 = new Thread(hlp);
        Thread t4 = new Thread(hlp);

        t1.start();
        t2.start();
        t3.start();
        t4.run();  // run method runs on a current thread, in our case its main thread
    }
}
