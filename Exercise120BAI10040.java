import java.util.Scanner;

public class Exercise120BAI10040 {

    public static void rectangle(int l, int b) {
        for (int row = 0; row < l; row++) {
            for (int col = 0; col < b; col++) {
                if (row == 0 || col == 0 || row == (l - 1) || col == (b - 1))
                    System.out.print("#");
                else
                    System.out.print("R");
            }
            System.out.println("");
        }

    }

    public static void square(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || col == 0 || row == (n - 1) || col == (n - 1))
                    System.out.print("^");
                else
                    System.out.print("S");
            }
            System.out.println("");
        }
    }

    public static void oval(int radius) {
        double dist;
        for (int row = 0; row <= 2 * radius; row++) {
            for (int col = 0; col <= 2 * radius; col++) {
                dist = Math.sqrt((row - radius) * (row - radius) +
                        (col - radius) * (col - radius));
                if (dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void arrow(int n) {
        for (int i = 1; i <= n; i++) {
            if (i != n)
                System.out.printf("%5s", " ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n-1) {
                for (int f = 0; f < n; f++) {
                    System.out.print("*");
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%5s", " ");
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hexagon(int n) {
        int l = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            int elem = i + n;

            for (int k = 0; k < elem; k++) {
                if ((k == n + i - 1) ||
                        (k == n - i - 1))
                    System.out.print("*");
                else if ((k > n + i - 1) ||
                        (k < n - i - 1))
                    System.out.print(" ");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        for (int m = 0; m < n - 2; m++) {
            for (int j = 0; j < l; j++) {
                if (j == 0 || j == l - 1)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }

        int r = n - 1;
        for (int h = r; h >= 0; h--) {
            int elem = h + n;
            for (int k = 0; k < elem; k++) {
                if ((k == n + h - 1) ||
                        (k == n - h - 1))
                    System.out.print("*");
                else if ((k > n + h - 1) ||
                        (k < n - h - 1))
                    System.out.print(" ");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void perfectTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }
            if (i == 1 || i == n)
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    System.out.print("!");
                }
            else {
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print("!");
                    else

                        System.out.print("$");
                }
            }
            System.out.println();

        }
    }

    public static void leftTriangle(int n) {
        //Left
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)

            {
                System.out.print("");
            }
            if (i == 1 || i == n)
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    System.out.print("+");
                }
            else {
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print("+");
                    else

                        System.out.print("A");
                }
            }
            System.out.println();

        }
        //right
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)

            {
                System.out.print("  ");
            }
            if (i == 1 || i == n)
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    System.out.print("+");
                }
            else {
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print("+");
                    else

                        System.out.print("A");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n) {
        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            if (spaces > i) {
                spaces = spaces - 1;
                stars = stars + 2;
            }
            if (spaces < i) {
                spaces = spaces + 1;
                stars = stars - 2;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        System.out.println(
                "Display a \n 1 -> rectangle (Border : # and fill : R) \n 2 -> square (border: ^ and fill: S) \n 3 -> an oval (@) \n 4 -> an arrow (*) \n 5 -> Hexagon (Border : * and fill: -) \n 6 -> Perfect Triangle (border: ! and fill: $) \n 7 ->  Triangle either left or right (Border:+ and  fill: A) \n 8 -> and a diamond (*)\n Enter your choice : \n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Length :");
                int l = input.nextInt();
                System.out.println("Enter Breadth :");
                int b = input.nextInt();
                rectangle(l, b);
                break;
            case 2:
                System.out.println("Enter Side :");
                int n = input.nextInt();
                square(n);
                break;
            case 3:
                System.out.println("Enter Height :");
                int h = input.nextInt();
                oval(h);
                break;
            case 4:
                System.out.println("Enter Height :");
                int ah = input.nextInt();
                arrow(ah);
                break;
            case 5:
                System.out.println("Enter Height :");
                int hh = input.nextInt();
                hexagon(hh);
                break;
            case 6:
                System.out.println("Enter Height :");
                int th = input.nextInt();
                perfectTriangle(th);
                break;
            case 7:
                System.out.println("Enter Height :");
                int lth = input.nextInt();
                leftTriangle(lth);
                break;
            case 8:
                System.out.println("Enter Height :");
                int dh = input.nextInt();
                diamond(dh);
                break;
            default:
                System.out.println("Please select one from the list...");
        }
        input.close();
    }
}
