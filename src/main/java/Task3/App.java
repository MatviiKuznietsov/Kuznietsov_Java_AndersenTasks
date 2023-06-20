package Task3;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Input array size");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) { //fill array with random numbers
            array[i] = random.nextInt(10);
        }
        for (int i : array) { //show array
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length; i++) { //show array which divided 3
            if (array[i] % 3 == 0) {
                System.out.printf("\n%s %d %s %d ", "Element", i, "is divided 3 = ", array[i]);
            }
        }
    }
}
