/*
 * NAME:     Aron Latinjak
 * DATE:     10/06/16
 * FILENAME: MathMethods.java
 * PURPOSE:  To allow a user access to 6 different math operations within the math class.
 */

package mathmethods;

//IMPORTS OF MATH CLASS AND SCANNER CLASS
import java.lang.Math;
import java.util.Scanner;

public class MathMethods 
{
    /**
     * 
     * @param x 
     * Postcondition: answer must be a double
     */
    public static void absValue(double x)
    {
        double answer;  
        answer = Math.abs(x);
        System.out.println("The absolute value of " + x + " is " + answer + ".");
    }
    /**
     * 
     * @param x
     * @param y
     * Postcondition: answer must be a double
     */
    public static void maxValue(double x, double y)
    {
        double answer;
        answer = Math.max(x,y);
        System.out.println("The largest value is " + answer + ".");
    }
    /**
     * 
     * @param x
     * @param y
     * Postcondition: answer must be a double
     */
    public static void minValue(double x, double y)
    {
        double answer;
        answer = Math.min(x,y);
        System.out.println("The smallest value is " + answer + ".");
    }
    /**
     * 
     * @param x
     * @param y
     * Postcondition: answer must be a double
     */
    public static void powValue(double x, double y)
    {
        double answer;
        answer = Math.pow(x,y);
        System.out.println("The answer is " + answer + ".");   
    }
    /**
     * 
     * @param x 
     * Postcondition: answer must be a double
     */
    public static double floorValue(double x)
    {
        double answer;
        answer = Math.floor(x);
        return(answer);
    }
    
    /**
     * 
     * @param x 
     * Postcondition: answer must be a double
     */
    public static double logValue(double x)
    {
        double answer;
        answer = Math.log(x);
        return(answer);
    }
    /** 
     * String is printed out
     */
    public static void outOfRange()
    {
        System.out.println("\nNot a valid option.\nPlease select a valid operation.");
    }
    
    public static void main(String[] args) 
    {
        //DECLARATION OF CHOICES AND SCANNERS
        int userChoice;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        //SHOWS USER OPTIONS AND WHICH INT CORRESPONDS TO WHICH OPERATION
        System.out.println("Please input your choice:");
        System.out.println("\n1: Absolute Value (1 Value)\t2: Maximum Value (2 Value)");
        System.out.println("3: Minimum Value (2 Value)\t4: Power Value (2 Value)");
        System.out.println("5: Floor Value (1 Value)\t6: Log Value (1 Value)");
        userChoice = input.nextInt();
        
        //IF STATEMENTS TO DETERMINE WHICH OPERATION TO RUN
        //ALSO ASK USER FOR 1 OR 2 DOUBLES TO INPUT
        if (userChoice == 1)
        {
            System.out.println("\nPlease input a number:");
            num1 = input.nextDouble();
            absValue(num1);
        }
        else if (userChoice == 2)
        {
            System.out.println("\nPlease input the first number:");
            num1 = input.nextDouble();
            System.out.println("Please input the second number:");
            num2 = input.nextDouble();
            maxValue(num1, num2);
        }
        else if (userChoice == 3)
        {
            System.out.println("\nPlease input the first number:");
            num1 = input.nextDouble();
            System.out.println("Please input the second number:");
            num2 = input.nextDouble();
            minValue(num1, num2);
        }
        else if (userChoice == 4)
        {
            System.out.println("\nPlease input the first number:");
            num1 = input.nextDouble();
            System.out.println("Please input the second number:");
            num2 = input.nextDouble();
            powValue(num1, num2);
        }
        else if (userChoice == 5)
        {
            System.out.println("\nPlease input a number:");
            num1 = input.nextDouble();
            floorValue(num1);
        }
        else if (userChoice == 6)
        {
            System.out.println("\nPlease input a number:");
            num1 = input.nextDouble();
            logValue(num1);
        }
        //IF THE SELECTED VALUE IS NOT A VALID OPTION
        else
        {
            outOfRange();
        }   
    } 
}