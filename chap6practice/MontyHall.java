import java.util.*;

public class MontyHall
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int cardoor = (int)(r.nextDouble()*3)+1;
        int goatdoor1 = cardoor;
        while (goatdoor1==cardoor)
        {
            goatdoor1 = (int) (r.nextDouble()*3)+1;
        }
        int goatdoor2 = goatdoor1;
        while (goatdoor2==goatdoor1 || goatdoor2==cardoor)
        {
            goatdoor2 = (int) (r.nextDouble()*3)+1;
        }
        

        int strat1 = 0;
        int strat2 = 0;
        
        int pchoice = 0;
        int hchoice = 0;
        
        for (int gamenum = 0; gamenum<100000; gamenum++)
        {
            pchoice = (int) (r.nextDouble()*3+1);
            
            while (hchoice == cardoor || hchoice == pchoice)
            {
                hchoice = (int) r.nextDouble()*3+1;
            }
            
            if (pchoice == cardoor)
            {
                strat1++;
            }
            
            else
            {
                strat2++;
            }
        }
        
        System.out.println("Strategy 1 (Sticking with your original choice) was correct " + strat1 +"/1000 times");
        System.out.println("Strategy 2 (Switching to the hosts choice) was correct " + strat2 +"/1000 times");
        
        
        
        
    }
}