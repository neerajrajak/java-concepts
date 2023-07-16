package learn.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrintExecuter {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 1; i <= 100; i++){
            NumberPrinter num = new NumberPrinter(i);
            executorService.submit(num);
        }
    }
}
