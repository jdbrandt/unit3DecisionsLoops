import java.util.*;


public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a wavelength in scientific notation, i.e. 9e10: ");
        double nu = s.nextDouble();
        if (nu<1e-11)
        {
            System.out.println("Gamma rays");
        }
        else if (nu<1e-8)
        {
            System.out.println("X-rays");
        }
        else if (nu<4e-7)
        {
            System.out.println("Ultraviolet");
        }
        else if (nu<7e-7)
        {
            System.out.println("Visible");
        }
        else if (nu<1e-3)
        {
            System.out.println("Infrared");
        }
        else if (nu<1e-1)
        {
            System.out.println("Microwaves");
        }
        else 
        {
            System.out.println("Radio waves");
        }
        
        
        
        
        
        
        
    }
}
