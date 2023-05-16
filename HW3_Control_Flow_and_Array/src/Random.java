import java.util.HashSet;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number please~ (1~99) ");
        int num = sc.nextInt();

        if (num < 1 || num > 99) {
            System.out.println("Wrong input!");
            return;
        }
        int[] arr = new int[num];

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < num; i++) {
            int number = (int) (Math.random() * 100) + 1;
            while (set.contains(number)) {
                number = (int) (Math.random() * 100) + 1;
            }
            arr[i] = number;
            set.add(number);
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

