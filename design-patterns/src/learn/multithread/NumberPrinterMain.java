package learn.multithread;

public class NumberPrinterMain {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            NumberPrinter num = new NumberPrinter(i);
            Thread t = new Thread(num);
            t.start();
        }
    }
}
