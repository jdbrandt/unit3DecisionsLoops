import java.util.*;

public class Fibbonacci
{
    public static void main(String[] args)
    {
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer n for which to print the nth Fibbonacci number: ");
        int n = s.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew;
        for (int i = 0; i < n; i++)
        {
            fnew = fold1+fold2;
            fold1 = fold2;
            fold2 = fnew;
        }
        
        System.out.println("The nth number is "+fold1);
        */
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
        
        
    }
    
    public static int Fibbonacci(int n)
    {
        if (n==1||n==2)
        {
            return 1;
        }
        else
        {
            return Fibbonacci(n-1)+Fibbonacci(n-2);
        }
    }
    
}