

public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("Condition 1");
        }
        if (word1.equals(word2))
        {
            System.out.println("Condition 2");
        }
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("Condition 3");
        }
        if ((word1.substring(0, 3)).compareTo(word2)==0)
        {
            System.out.println("Condition 4");
        }
    }
}
