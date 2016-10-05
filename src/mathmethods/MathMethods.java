/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;

import java.lang.Math;
import java.util.Scanner;

public class MathMethods 
{
    public static void absValue(double x)
    {
        double answer;  
        answer = Math.abs(x);
        System.out.println("The absolute value of " + x + " is " + answer + ".");
    }
    
    public static void maxValue(double x, double y)
    {
        double answer;
        answer = Math.max(x,y);
        System.out.println("The largest value is " + answer + ".");
    }
    
    public static void minValue(double x, double y)
    {
        double answer;
        answer = Math.min(x,y);
        System.out.println("The smallest value is " + answer + ".");
    }
    
    public static void powValue(double x, double y)
    {
        double answer;
        answer = Math.pow(x,y);
        System.out.println("The answer is " + answer + ".");   
    }
    
    
    
    
    

    public static void main(String[] args) 
    {
        int userChoice;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Please input your choice:");
        System.out.println("1: ");
        System.out.println("2: ");
        System.out.println("3: ");
        System.out.println("4: ");
        System.out.println("5: ");
        System.out.println("6: ");
        userChoice = input.nextInt();  
    } 
}