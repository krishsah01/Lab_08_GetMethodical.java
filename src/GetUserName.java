import java.util.Scanner;

public class GetUserName

{

    public static void main(String[] args)

    {

        Scanner in = new Scanner(System.in);

        String firstName ;

        String lastName;

        firstName = SafeInput.getNonZeroLenString(in, "First Name");

        lastName = SafeInput.getNonZeroLenString(in, "Last Name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }

}