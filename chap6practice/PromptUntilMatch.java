import java.util.Scanner;

public class PromptUntilMatch
{
    public static double prompt()
    {
        Scanner s = new Scanner(System.in);
        
        boolean valid = false;
        double input = 0;
        
        do
        {
            System.out.print("Please enter a positive number less than 100: ");
            input = s.nextDouble();
            if (input>0&&input<100)
            {
                valid = true;
            }
        }
        while(!valid);
        return input;
    }
}
