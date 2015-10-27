import java.util.Scanner;

public class SumAndAverageValue
{
    
    public static double averageInputs()
    {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        
        System.out.println("Enter a series double, or any other to quit");
        
        while (s.hasNextDouble())
        {
            sum += s.nextDouble();
            count++;
        }
        
        double average = 0;
        if (count>0)
        {
            average = sum/count;
        }
        
        return average;
    }
}

        
        