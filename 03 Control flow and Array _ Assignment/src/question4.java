public class question4 {
    public static void main(String[] args) {

        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};

        for (int i = 1; i <= 5; i++) {
            switch(i) {
                case 1:
                    System.out.print(i + "st row: ");
                    for (int j = 0; j < n[0].length; j++) {
                        System.out.print(n[0][j] + "\t");
                    }
                    break;
                case 2:
                    System.out.print(i + "nd row: ");
                    for (int j = 0; j < n[1].length; j++) {
                        System.out.print(n[1][j] + "\t");
                    }
                    break;
                case 3:
                    System.out.print(i + "rd row: ");
                    for (int j = 0; j < n[2].length; j++) {
                        System.out.print(n[2][j] + "\t");
                    }
                    break;
                case 4:
                    System.out.print(i + "th row: ");
                    for (int j = 0; j < n[3].length; j++) {
                        System.out.print(n[3][j] + "\t");
                    }
                    break;
                case 5:
                    System.out.print(i + "th row: ");
                    for (int j = 0; j < n[4].length; j++) {
                        System.out.print(n[4][j] + "\t");
                    }
                    break;
                default:
                    System.out.println("Invalid row number!");
                    break;
            }
            System.out.println();
        }
    }
}
