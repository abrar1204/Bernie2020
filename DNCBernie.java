

// Democratic Primary 2020

import java.util.Scanner;

public class DNCBernie 
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in );
    
    int primaries; 
    int needed; 
    
    System.out.println("Enter Bernie's current number of delegates here: ");
    primaries = s.nextInt(); 
    
    
    if (primaries < 1200 && primaries > 0)   
    {
      needed = (1200 - primaries);
    System.out.println("This is how many more delegates Bernie needs to influence the party platform: " + needed);
    }
    
    else if (primaries > 1200 && primaries < 3980)
    {
    System.out.println("Bernie has enough delegates to influence the party platform.");
    }
    
    else if (primaries == 1200) 
      {
    System.out.println("Bernie has enough delegates to influence the party platform.");
    }
    
    else if (primaries < 0)
      {
    System.out.println("Please enter a positive number.");
    }
     else if (primaries > 3979)
     {
       System.out.println("There's only 3979 pledged delegates on the first ballot.");
    }
      }
  }
