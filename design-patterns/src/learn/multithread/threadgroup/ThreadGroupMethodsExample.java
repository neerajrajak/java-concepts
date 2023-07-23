package learn.multithread.threadgroup;

public class ThreadGroupMethodsExample {
    public static void main(String[] args) throws Exception {
        ThreadGroup pg =new ThreadGroup("Parent Group");
        ThreadGroup cg =new ThreadGroup(pg, "Child Group");
        MyThread t1 = new MyThread(pg, "parent group thread 1");
        MyThread t2 = new MyThread(pg, "parent group thread 2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }

}
