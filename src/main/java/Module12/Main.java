package Module12;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());


        Thread thread1=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });
        thread1.start();

    }
}
