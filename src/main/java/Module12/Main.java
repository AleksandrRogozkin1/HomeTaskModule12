package Module12;

public class Main {
    public static void main(String[] args){
        System.out.println("Time counter");
        Thread thread2=new Thread(CounterSeconds::everyOneSecond);
        Thread thread1=new Thread(CounterSeconds::everyFiveSecond);
        thread2.start();
        thread1.start();










    }
}
