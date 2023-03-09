package Module12;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {
    public static volatile AtomicInteger number = new AtomicInteger(1);
    public static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private static volatile int n;
    public FizzBuzz(int n) {
        this.n = n;

    }

    public void fizz() throws InterruptedException {
        while (number.get()< n){
            if(number.get() % 3 == 0 && number.get() % 5 != 0){
                queue.add("fizz");
                number.incrementAndGet();
            }
        }
    }

    public void buzz() throws InterruptedException{
        while (number.get()< n){
            if(number.get() % 3 != 0 && number.get() % 5 == 0){
                queue.add("buzz");
                number.incrementAndGet();
            }
        }
    }

    public void fizzBuzz() throws InterruptedException{
        while (number.get()< n){
            if(number.get() % 3 == 0 && number.get() % 5 == 0){
                queue.add("fizzBuzz");
                number.incrementAndGet();
            }
        }
    }


    public void number() throws InterruptedException{
        while (number.get()< n){
            if(number.get() % 3 != 0 && number.get() % 5 != 0){
                queue.add(String.valueOf(number.get()));
                number.incrementAndGet();

            }
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }

        }

    }


}


