package Calculator;

import java.util.Scanner;

public class ArithmeticCalculator {		//Creating a class
	float num1, num2;

	public static void main(String[] args) {
		int calculator;
		
		ArithmeticCalculator b = new ArithmeticCalculator(); //Creating an object
		System.out.println("Enter the two numbers");
		Scanner a = new Scanner(System.in);  //Using scanner to get the values from the user.
		b.num1 = a.nextFloat();
		b.num2 = a.nextFloat();
		
		while(true) {	//Using while statement to display the operation.
			System.out.println("Enter 1 to perform substraction");
			System.out.println("Enter 2 to perform addition");
			System.out.println("Enter 3 to perform Multiplication");
			System.out.println("Enter 4 to perform Division");
			System.out.println("Enter 5 to Exit");
		calculator = a.nextInt();
		switch(calculator) 	//Using switch case to choose the operation.
		{
		case 1: int substraction = (int)(b.num1 - b.num2);	  //Using type casting to convert float into int. 
		System.out.println("The answer is" + substraction);
		break;
		
		case 2: int addition = (int)(b.num1 + b.num2);
		System.out.println("The answer is" + addition);
		break;
		
		case 3: int Multiplication = (int)(b.num1 * b.num2);
		System.out.println("The answer is" + Multiplication);
		break;
		
		case 4: int division = (int)(b.num1 / b.num2);
		System.out.println("The answer is" + division);
		break;
		case 5: System.exit(0);
			}
		}
		
	}

}



