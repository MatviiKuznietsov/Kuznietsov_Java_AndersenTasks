package Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Input number");
        Scanner in = new Scanner(System.in);
        try {
            int number = Integer.parseInt(in.next());
            if (number > 7) {
                System.out.println("Hello!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input Data isn`t digit " + e);
        }
    }
}
