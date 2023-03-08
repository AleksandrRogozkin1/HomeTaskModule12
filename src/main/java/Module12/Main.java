package Module12;

public class Main {
    public static void main(String[] args) {
       Thread thread=new Thread(CounterSeconds::everyOneSecond);
       Thread thread1=new Thread(CounterSeconds::everyFiveSecond);
       thread.start();
       thread1.start();


    }
}
