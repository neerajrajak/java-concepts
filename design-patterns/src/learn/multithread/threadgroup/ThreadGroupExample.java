package learn.multithread.threadgroup;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("New Group");
        System.out.println(g.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g, "Second Group");
        System.out.println(g2.getParent().getName());
    }
}
