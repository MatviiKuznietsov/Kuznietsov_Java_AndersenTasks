package Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws {
        System.out.println("Input name Vecheslav or other name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        InputName inputName = new InputName(name);
        inputName.returnSign();
    }
}
