package simple_compound_interest;
/**
 * 
 * @author Aditya Abhiram
 *
 * This program determines the simple interest for the given inputs.
 */
public class Simple_Interest extends Interest {
	public double interest(){
		return principal*rate_of_interest*years;
	}
}

