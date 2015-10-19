import java.util.*;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x axis: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y axis: ");
      double ycenter1 = in.nextDouble();
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      System.out.print("Input the x axis: ");
      double xcenter2 = in.nextDouble();
      System.out.print("Input the y axis: ");
      double ycenter2 = in.nextDouble();
      double distance = Math.sqrt(Math.pow(ycenter2-ycenter1,2)+Math.pow(xcenter2-xcenter1,2));
      if (radius1>=(radius2+distance)||radius2>=(radius1+distance))
      {
          System.out.println("They contain themselves");
      }
      else if (radius1+radius2<=distance)
      {
          System.out.println("They are disjointed");
      }
      else
      {
          System.out.println("They are overlapping");
        }
   }
}