import java.util.Scanner;

public class MaxAndMin
{
    public static double maximum()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a series of numbers. Any other characters to quit");
        double largest = s.nextDouble();
        double input;
        while (s.hasNextDouble())
        {
            input = s.nextDouble();
            if (input>largest)
            {
                largest = input;
            }
            
        }
        return largest;
    }
    public static double minimum()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a series of numbers. Any other characters to quit");
        double smallest = s.nextDouble();
        double input;
        while (s.hasNextDouble())
        {
            input = s.nextDouble();
            if (input<smallest)
            {
                smallest = input;
            }
            
        }
        return smallest;
    }



}

            