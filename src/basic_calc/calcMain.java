package basic_calc;

import java.util.Scanner;

public class calcMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the operation (+,-,*,/,%, or exit): ");
			String op = s.next();
			
			// ==: compares memory address while .equals() compares actual content
			if(op.equals("exit")) {
				break; // only breaks the loop, still runs everything outside of loop
			}
			
			System.out.print("Enter the first number: ");
			int num1 = s.nextInt();
			
			System.out.print("Enter the second number: ");
			int num2 = s.nextInt();
			
			switch(op) {
				case "+": int add = num1 + num2;
				System.out.println("Result: " + add);
				break;
				case "-": int sub = num1 - num2;
				System.out.println("Result: " + sub);
				break;
				case "*": int mult = num1 * num2;
				System.out.println("Result: " + mult);
				break;
				case "/": int div = num1 / num2;
				System.out.println("Result: " + div);
				break;
				case "%": int rem = num1 % num2;
				System.out.println("Result: " + rem);
				break;
				default:
					System.out.println("Invalid operation" + op);
					continue;
				}
			
		}
		System.out.println("Thanks for using this calculator!");
		s.close();
	
	}
}