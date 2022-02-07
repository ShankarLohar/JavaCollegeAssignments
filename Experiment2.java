import java.util.Scanner;
// 20BAI10040 Shankar Lohar CSE3002 Programming in Java
class Experiment2{
    // Printing horizontal graphs...
    public static void main(String[] args){
        System.out.println("Enter the length (between 1 and 30) of 5 bars in the graph :");
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        for(int iterator = 0; iterator<5; iterator++){
            System.out.println("Enter the bar "+ (iterator+1) +" for the graph");
            int bar = input.nextInt();
            arr[iterator] = bar;
        }
        input.close();
        System.out.println();
        System.out.println();
        System.out.println("The Graph is Displayed below - ");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println();
        for (int value : arr) {
            System.out.print("|");
            for (int col = 0; col < value; col++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}