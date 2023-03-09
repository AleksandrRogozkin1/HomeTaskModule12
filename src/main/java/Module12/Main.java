package Module12;

public class Main {
    public static void main(String[] args){
//        System.out.println("Time counter");
//        Thread thread2=new Thread(CounterSeconds::everyOneSecond);
//        Thread thread1=new Thread(CounterSeconds::everyFiveSecond);
//        thread2.start();
//        thread1.start();

        FizzBuzz fb = new FizzBuzz(20);
        Thread A = new Thread(() -> {
            try {
                fb.fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread B = new Thread(() -> {
            try {
                fb.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread C = new Thread(() -> {
            try {
                fb.fizzBuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread D = new Thread(() -> {
            try {
                fb.number();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        A.start();
        B.start();
        C.start();
        D.start();
    }
}
