public class NumException {
    public static void main(String[] args) {
        String[] strNum = {"23", "522", "4.14", "429"};
        String test = null;
        int i = 0;
        try {
            for (i = 0; i < strNum.length; i++) {
                int j = Integer.parseInt(strNum[i]);
                System.out.println("Converted value is " + j);
                // Exception occurs when i == odd
                if (i % 2 == 1) System.out.println(test.length());
            }
        } catch (NumberFormatException e) {
            System.out.println(strNum[i] + "can't be converted to integer");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // use in catch block
            e.printStackTrace(); // print all history of tracing exception source to console
        }
    }
}
