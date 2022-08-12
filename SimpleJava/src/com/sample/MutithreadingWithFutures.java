package com.sample;

import java.util.Arrays;
import java.util.concurrent.*;

public class MutithreadingWithFutures {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Callable<String> callable=()->{
            Thread.sleep(2000);
          return "something is goofed up";
        };

        Future<String> submit = executorService.submit(callable);

        System.out.println("Do something else while executing callable");
        System.out.println("Retriving result from future");
        String result=submit.get();

        System.out.println(result);

        System.out.println("I am waiting for something");
        executorService.shutdown();


        String str="AIEAOEIA";
        String[] chr=str.split("");
        String[] strings = Arrays.stream(chr).sorted().toArray(size -> new String[size]);
        System.out.println(strings.length);
      Arrays.stream(strings).forEach(System.out::println);
    }
}
