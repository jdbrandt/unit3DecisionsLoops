import java.util.Scanner;

public class SumAndAverageValue
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        String input;
        
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
        
        System.out.println("The sum of the series is "+sum);
        
        if (count>0)
        {
            System.out.println("The average of the series is "+average);
        }
        else
        {
            System.out.println("There were no numbers to average");
        }
    }
}

        
        