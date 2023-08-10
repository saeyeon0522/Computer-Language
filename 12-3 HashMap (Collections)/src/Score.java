import java.util.*;

public class Score {
    public static void main(String[] args) {
        HashMap<String, Integer> score = new HashMap<>();

        score.put("saeyeon", 52);
        score.put("saelim", 42);
        score.put("cherry", 41);

        System.out.println("HashMap size : " + score.size());
        Set<String> keys = score.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int grade = score.get(name);
            System.out.println(name + " : " + grade);
        }
    }
}
