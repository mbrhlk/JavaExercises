import java.util.Scanner;
class CylinderVolume 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Radius:");
         double r=s.nextDouble();
         System.out.println("Height:");
         double h=s.nextDouble();
 
            double  volume=((22*r*r*h)/7);
 
            System.out.println("The volume of Cylinder is: " +volume);
       
 
       
          
   }
}