package org.amalitech.calsscode_09_01_2020;

public class PerfectSquare {

	
	public static void main(String[]args) { 
	 //int []input= {121,625,114} ;

		// pass input to printf and return the formated result from findNextSquare method
		System.out.printf("findNextSquare(%d) --> returns %d\n",121,findNextSquare(121));
		System.out.printf("findNextSquare(%d) --> returns %d\n",625,findNextSquare(625));
		System.out.printf("findNextSquare(%d) --> returns -1 since 114 is not a perfect",141,findNextSquare(141));
		
		}
	
	// create method findNextSquare
	 public  static int findNextSquare(int number) {
		 // find square root of input and assign to variable
		 double pefectSquare_int = (int) Math.sqrt(number);
		 
		 // check to see if the square root is a positive number(if it is equal to 0 then ) 
		 if(pefectSquare_int - Math.floor(pefectSquare_int)==0) {
			 
			 // add 1 to the perfect integer and assign to a new variable
			 int next_Number = ((int)Math.floor(pefectSquare_int)+1); 
			 
			 // multiply the new variable by itself and save it to a new variable as answer
			int next_pefectSquare = next_Number * next_Number;
			
			//return the answer you got
			return next_pefectSquare;
			 
		 }else {
			 //if the compare statement is false then return -1
			 return -1;
		 }
		
	 }
}
