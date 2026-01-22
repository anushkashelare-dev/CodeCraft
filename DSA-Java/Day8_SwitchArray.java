import java.util.Scanner;

public class Day8_SwitchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 100;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Print Array");
        System.out.println("2. Find Sum");
        System.out.println("3. Find Maximum");

        int option = sc.nextInt();

        long startTime = System.nanoTime();

        switch (option) {

            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 2:
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum: " + sum);
                break;

            case 3:
                int max = arr[0];
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("Maximum: " + max);
                break;

            default:
                System.out.println("Invalid choice");
        }

        long endTime = System.nanoTime();

        double timeInMs = (endTime - startTime) / 1_000_000.0;
        System.out.println("Execution Time: " + timeInMs + " ms");

        sc.close();
    }
}
