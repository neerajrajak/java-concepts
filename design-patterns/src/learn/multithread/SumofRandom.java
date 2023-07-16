package learn.multithread;

import java.util.Random;
import java.util.concurrent.Callable;

public class SumofRandom implements Callable {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println(i+ " generate by: "+ Thread.currentThread().getName());
        Thread.sleep(3000);
        return i;
    }
}
