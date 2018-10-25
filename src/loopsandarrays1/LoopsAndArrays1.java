/*
 * Evan Robertson
 * October 25th 2018
 * Tell's user to enter 20 numbers and then calculates the sum
 */

package loopsandarrays1;

import java.util.Scanner;
/**
 *
 * @author evrob0095
 */
public class LoopsAndArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        //Declare array
        int [ ] numbers = new int [20];
        int total = 0;
        
        //Ask user to put in numbers
        System.out.println("Enter twenty integers and they will be added together:");
        
        //Loop to declare variables for each number inputed
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //Loop to calculate the sum of all the numbers
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        //Output total
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
