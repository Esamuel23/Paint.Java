import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        boolean validInput = false;
        do {
        	try {
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        		if (wallHeight <= 0) {
        			throw new IllegalArgumentException("Invalid input, number must be positive.");
        		}
        		    validInput = true;
        	}   catch (InputMismatchException e) {
        		System.out.println("Invalid number. Numbers must be positive and numeral");
        		scnr.next();
        	}   catch (IllegalArgumentException e) {
        		System.out.println(e.getMessage());
        	}
        } while (!validInput);
        
          validInput = false;
       // Implement a do-while loop to ensure input is valid
       // Prompt user to input wall's width   
          do {
        	  try {
        		  System.out.println("Enter wall width (feet): ");
        		  wallWidth = scnr.nextDouble();
        		  if (wallWidth <= 0) {
        			  throw new IllegalArgumentException("Invalid input, number must be positive.");
        			  
        		  } 
        		  validInput = true;
        	  } catch (InputMismatchException e)
        	  { 
        		  System.out.println("Invalid number. Numbers must be positive and numeral");
        		  scnr.next();
        		  
        	  } catch (IllegalArgumentException e) {
        		  System.out.println(e.getMessage());
        	  } 
        	  // Calculate and output wall area
          
          }    while (!validInput);
          wallArea = wallHeight * wallWidth;
          System.out.println("Wall area: " + wallArea);

          // Calculate and output the amount of paint (in gallons) needed to paint the wall
          gallonsPaintNeeded = wallArea/squareFeetPerGallons;
          System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");  
          
          scnr.close();
          }
        }

