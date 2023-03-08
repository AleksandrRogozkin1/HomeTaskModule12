package Module12;

import java.util.concurrent.TimeUnit;

public class CounterSeconds extends Thread {

    private static int count=0;

    public static  void everyOneSecond(){

        while (true){
            System.out.println(count);
            count++;
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }

    }
    public static void everyFiveSecond(){
        while (true){
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Пройшо 5 секунд");
        }
    }
//    public static void everyOneSecond() {
//        long startTime = System.currentTimeMillis();
//        while (true) {
//            long currentTime = System.currentTimeMillis();
//            long elapsed = currentTime - startTime;
//            System.out.println(TimeUnit.MILLISECONDS.toSeconds(elapsed) );
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void everyFiveSecond() {
//        while (true) {
//            System.out.println("Пройшло 5 секунд");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }


}
