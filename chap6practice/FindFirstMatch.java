
public class FindFirstMatch
{
    public static int findMatch(String str)
    {
        boolean found = false;
        int position = 0;
        while (!found && position<str.length())
        {
            if (str.charAt(position) == ' ')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        if (!found)
        {
            position = -1;
        }
        return position;
    }
}

            
           