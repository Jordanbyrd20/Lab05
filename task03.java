import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
            System.out.println("Party Affiliation Menu:");
            System.out.println("D - Democratic");
            System.out.println("R - Republican");
            System.out.println("I - Independent");
            System.out.print("What is your party affiliation?: ");
        Scanner in = new Scanner(System.in);
        String partyAffiliation = in.nextLine().toUpperCase();
            if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        in.close();
    }
}

