public class NestedLoops
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 1;
        do
        {
            do
            {
                System.out.println(i+" "+j);
                if (j==4)
                {
                    j=1;
                    break;
                }
                j++;
            }
            while(j<5);
            i++;
        }
        while(i<3);
    }
}
