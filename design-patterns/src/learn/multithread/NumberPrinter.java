package learn.multithread;

public class NumberPrinter implements Runnable{

    private int number;

    public NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " printed from: "+Thread.currentThread().getName());
    }
}
