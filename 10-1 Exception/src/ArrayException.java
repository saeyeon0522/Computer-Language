public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        try {
            for (int i = 0; i < 5; i++) {
                // Exceptions occurs when i == 4
                arr[i + 1] = i + 1 + arr[i];
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {System.out.println("Out of index");}
    }
}
