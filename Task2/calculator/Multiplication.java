package calculator;
/**
 * 
 * @author Aditya Abhiram
 * This program finds the multiplication of numbers.
 * number1 and number2 are inputs.
 * 
 */

public class Multiplication {
    int number1,number2;
	
	Multiplication(){} //Default constructor
	
	Multiplication(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int multiply(){
		return number1*number2;
	}
}
