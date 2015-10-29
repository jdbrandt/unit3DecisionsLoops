import java.util.*;

public class CompareAdjacentValues
{
    public static final double EPSILON = 1e-12;
    public static void checkAdjDups()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit");
        double input = 0;
        while (s.hasNextDouble())
        {
            double previousInput = input;
            input = s.nextDouble();
            if (Math.abs(input-previousInput)<EPSILON)
            {
                System.out.println("Duplicate");
                break;
            }
        }
                
            
        
    }
}
