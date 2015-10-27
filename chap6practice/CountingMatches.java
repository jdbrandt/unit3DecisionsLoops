public class CountingMatches
{
    public static int countSpaces(String str)
    {
        int numMatches = 0;
        
        for (int i = 0; i<str.length(); i++)
        {
            if (str.charAt(i)==' ')
            {
                numMatches++;
            }
        }
        return numMatches;
    }
}
        