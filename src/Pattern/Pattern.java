package Pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                if (atEveryIndex == 0) atEveryIndex = originalN;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int c = row > n ? 2 * n - row : row;
            for (int space = 0; space <= n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 0; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= c; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
//                for Every row , run col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
//              when one row is printed , we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
//                for Every row , run col
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
//              when one row is printed , we need to add a newline
            System.out.println();
        }
    }


    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
//                for Every row , run col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
//              when one row is printed , we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
//                for Every row , run col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
//              when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
