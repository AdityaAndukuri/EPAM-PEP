package calculator;
/**
 * 
 * @author Aditya Abhiram
 * Driver program which tests the other programs.
 *
 */
public class Calculator {
	
	public static void main(String args[]){
		
		additionTestCases();
		subtractionTestCases();
		multiplicationTestCases();
		divisionTestCases();
	}
		
	
	static void additionTestCases(){
		//Test case 1:
		Addition addition=new Addition(1,1);
		if(addition.add()==2)
			System.out.println("Addition of  "+1+" and "+1+" is "+2);
		else
			System.out.println("Wrong output for "+1+" and "+1);
		
		//Test case 2
		addition=new Addition(-5,-7);
		if(addition.add()==-12)
			System.out.println("Addition of  "+(-5)+" and "+(-7)+" is "+(-12));
		else
			System.out.println("Wrong output for "+(-5)+" and "+(-7));
		
		
	}

	static void subtractionTestCases(){
		//Test case 1:
		Subtraction subtraction=new Subtraction(1,1);
		if(subtraction.sub()==0)
			System.out.println("Subtraction of  "+1+" and "+1+" is "+0);
		else
			System.out.println("Wrong output for "+1+" and "+1);
		
		//Test case 2
		subtraction=new Subtraction(-5,-7);
		if(subtraction.sub()==2)
			System.out.println("Subtraction of  "+(-5)+" and "+(-7)+" is "+2);
		else
			System.out.println("Wrong output for "+(-5)+" and "+(-7));
		
		
	}
	
	static void multiplicationTestCases(){
		//Test case 1:
		Multiplication multiplication=new Multiplication(10,10);
		if(multiplication.multiply()==100)
			System.out.println("Multiplication of  "+10+" and "+10+"is "+100);
		else
			System.out.println("wrong output for "+10+" and "+10);
		
		//Test case 2
		multiplication=new Multiplication(5,0);
		if(multiplication.multiply()==0)
			System.out.println("Multiplication of  "+5+" and "+0+" is "+0);
		else
			System.out.println("Wrong output for "+5+" and "+0);
		
	}
	
	static void divisionTestCases(){
		//Test case 1
		Division division=new Division(5,0);
		try{
			division.divide();
			System.out.println("Wrong output for "+5+" and "+0);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero Exception");
		}
		
		//Test case 2
		
		division=new Division(100,5);
		if(division.divide()==20)
			System.out.println("Division of  "+100+" and "+5+" is "+2);
		else
			System.out.println("Wrong output for "+100+" and "+5);
	}
}
