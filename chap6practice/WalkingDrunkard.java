import java.util.Random;


public class WalkingDrunkard
{
    public static void main(String[] args)
    {
        System.out.print('\u000C'); 
        Random r = new Random();
        
        int x = 0;
        int y = 0;
        
        int randNum;
        
        for (int i = 0; i < 100; i++)
        {
            randNum = r.nextInt(2);
            
            if (randNum == 0)
            {
                y++;
            }
            else
            {
                y--;
            }
            
            randNum = r.nextInt(2);
            if (randNum == 0)
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        System.out.println("("+x+","+y+")");
    }
}

  