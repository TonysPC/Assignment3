package cse360assign3;

public class Calculator {
	
	private int total;
	
	public Calculator(){
		total = 0;	//not needed. included for clarity
	}
	
	/**
	 * returns the correct total
	 * @param none
	 */
	public int getTotal(){
		return total;
	}
	
	/**
	 * adds the parameter value to the total
	 * @param value
	 */
	public void add(int value){
		total = value + total;
	}
	
	/**
	 * subtracts the parameter value from the total
	 * @param value
	 */
	public void subtract(int value){
		total = total - value;
	}
	
	/**
	 * multiplies the total by the parameter value 
	 * @param value
	 */
	public void multiply(int value){
		total = total * value;
	}
	
	/**
	 * divides the total by the parameter value 
	 * @param value
	 */
	public void divide(int value){
		if(value == 0)
			total = 0;
		else
			total = total/value;
	}
	
	/**
	 * returns an empty string ""
	 * @param none
	 * 
	 */
	public String getHistory(){
		return "";	//empty string 
		
	}
}