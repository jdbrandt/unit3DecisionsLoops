import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        String str = "";
        for (int i = 0; i<2*n-1; i+=2)
        {
           str = "";
           for (int a = 0; a<(2*n-i)/2; a++)
           {
               str+=" ";
            }
           for (int a = 0; a<=i; a++)
           {
               str+="*";
            }
           for (int a = 0; a<(2*n-i)/2; a++)
           {
               str+=" ";
            }
           System.out.println(str);
        }

        }
    }
}
