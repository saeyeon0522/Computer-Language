import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i< 1000000; i++) list.add(1);

            long endTime = System.currentTimeMillis();
            long durationTimeSec = endTime - startTime;
            System.out.println("ArrayList : " + durationTimeSec + "m/s");
        }).start(); // faster than vector

        new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i< 1000000; i++) vector.add(1);

            long endTime = System.currentTimeMillis();
            long durationTimeSec = endTime - startTime;
            System.out.println("Vector : " + durationTimeSec + "m/s");
        }).start();
    }
}
