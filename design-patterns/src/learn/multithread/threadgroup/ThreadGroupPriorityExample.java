package learn.multithread.threadgroup;

public class ThreadGroupPriorityExample {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("***** Priority *******");
        System.out.println();

        ThreadGroup g3 = new ThreadGroup("t3");
        Thread t1 = new Thread(g3, "First Thread");
        Thread t2 = new Thread(g3, "Second Thread");
        g3.setMaxPriority(3);
        Thread t3 = new Thread(g3, "Third Thread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
