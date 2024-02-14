import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = in.nextInt();

        // Over 21
        if (age >= 21) {
            System.out.println("Here is your wristband. Please enjoy your stay.");
        }
        // Fail
        else {
            System.out.println("You are not of legal age to enter.");
        }

    }
}