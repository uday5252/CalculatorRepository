package com.abc.demo;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		 double num1, num2;
	       
	        num1 = 10.45;
	        num2 = 20.12;

	      
	        char operator = '+';

	        double result;
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;

	            case '-':
	                result = num1 - num2;
	                break;

	            case '*':
	                result = num1 * num2;
	                break;

	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Division by zero is not allowed.");
	                    return;
	                }
	                result = num1 / num2;
	                break;

	            default:
	                System.out.println("Invalid operator.");
	                return;
	        }
	        System.out.println("The final result:");
	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

	        System.out.println("Code execution completed!");
	}

}
