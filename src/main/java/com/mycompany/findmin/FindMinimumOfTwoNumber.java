

package com.mycompany.findmin;

import java.util.Scanner;

public class FindMinimumOfTwoNumber 
{

    public static void main(String[] args) 
    {
        //Initialize Scanner for user inputs
        Scanner sc = new Scanner(System.in);
        
        //Prompt the user to input the first number
        System.out.print("Enter the first number: ");
        String firstNum = sc.nextLine();
        
        //Prompt the user to input the second number
        System.out.print("Enter the second number: ");
        String secondNum = sc.nextLine();
        
        //Display entered numbers
        System.out.println("First Number: "+firstNum);
        System.out.println("Second Number: "+secondNum);
                 
        //Convert the String to an Int
        int numOne = Integer.parseInt(firstNum);
        int numTwo = Integer.parseInt(secondNum);
        
        //Now find the minimum of two numbers using if statement
        
        if(numOne > numTwo)
        {
            
            System.out.println("First number is greater than the second number.");
        }
        else if(numTwo > numOne)
            {
                System.out.println("Second number is greater than the first number.");
            }
        else
                {
                    System.out.println("Both numbers are equal.");
                }
        
        
    }
}
