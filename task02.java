import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth month (1–12): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer between 1 and 12.");
            scanner.close();
            return;
        }
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }
        scanner.close();
    }
}