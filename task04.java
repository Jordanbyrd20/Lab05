import java.util.Scanner;
public class task04
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int Old_Enough = 21;
        int age = 0;
        String trash = "";
        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            if(age >= Old_Enough)
            {
                System.out.println("You are 21 or older, you get a wrist band!");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ", which is not a valid entry. Run the program again with correct input.");
        }
    }
}
