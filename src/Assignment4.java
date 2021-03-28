// CSE 110     : <Spring 2021>
// Assignment  : <assignment #4>
// Author      : <Erik Christian Gotta> & <1222628953>
// Description : <5 methods, some with return types some without>

import java.util.Scanner;
public class Assignment4 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Write any code here that you may wish to test your methods defined below.

        //Method1
        displayGreeting();

        //Method2
        System.out.println("Please enter an integer for the second method");
        int integer = sc.nextInt();
        displayText(integer);

        //Method3
        System.out.println("Please enter 3 integers to add for the 3rd method");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        printTotal(num1, num2, num3);

        //Method4
        System.out.println("Please enter another 3 integers for the 4th method");
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        System.out.println(getTotal(num4, num5, num6));

        //Method5
        System.out.println("Please enter another 3 integers for the 5th method");
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        System.out.println(getAverage(num7, num8, num9));

        sc.close();
    }

  
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting() {
        System.out.println("Hello, and welcome!");        
    }
    
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single integer argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(int integer) {
        System.out.println(integer);
    }
    
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    static void printTotal(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
        
    }
    
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    static int getTotal(int num1, int num2, int num3) {
        int total = (num1 + num2 + num3);
        return total;
    }
    
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double 
    static double getAverage(int num1, int num2, int num3) {
        double average = (double) (num1 + num2 + num3) / 3;
        return average;
    }

}