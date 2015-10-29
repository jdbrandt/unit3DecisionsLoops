import java.util.*;
public class Substring
{

    public static void main(String[] args)
    {
        System.out.println("Enter any word: ");
        Scanner scan = new Scanner(System.in);
        String word=scan.next();
        int n=word.length();
        int first = 0;
        int next = 1;
        int last = n;
        while (next<n)
        {
            
            while (next < n+1)
            {
                System.out.println(word.substring(first,next));
                first++;
                next++;
            }
            first=0;
            next++;
       
        }

    }
}
