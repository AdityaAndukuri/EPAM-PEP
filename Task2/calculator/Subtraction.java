package calculator;
/**
 * 
 * @author Aditya Abhiram
 * This program finds the subtraction of numbers.
 * number1 and number2 are inputs.
 * 
 */
public class Subtraction {
	int number1,number2;
	
	Subtraction(){} //Default constructor
	
	Subtraction(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int sub(){
		return number1-number2;
	}
}
