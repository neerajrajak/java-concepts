package learn.multithread.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumofRandomMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        SumofRandom generator1 = new SumofRandom();
        SumofRandom generator2 = new SumofRandom();

        Future<Integer> randomNumber1 = executorService.submit(generator1);
        Future<Integer> randomNumber2 = executorService.submit(generator2);

        System.out.println("Main class ....");

        System.out.println("Sum: "+ (randomNumber1.get()+randomNumber2.get()));


    }
}
