public class ArrayPassing {
    static void increase(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i]++;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        increase(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
