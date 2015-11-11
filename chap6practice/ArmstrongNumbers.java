public class ArmstrongNumbers
{
    public static  void main(String[] args)
    {
        System.out.print('\u000C'); 
        String armNums = "";
        
        for (Integer i=1; i<100000; i++)
        {
            int sum = 0;
            int len = (i+"").length();
            String stringNum = i.toString();
            for(int j=0; j<len; j++)
            {
                sum+=Math.pow(Character.getNumericValue(stringNum.charAt(j)),3);
            }
            if (sum==i)
            {
                armNums+=(sum+"\n");
            }
        }
        System.out.println(armNums);
    }
}
