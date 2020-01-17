package org.amalitech.calsscode_09_01_2020;

//import java.util.Scanner;

public class ClassCode_09_01_2020_BenHelp {

	public static void main(String[]args) {

		// create array for input
		String [] keyWord= {"","anA","abc","del","Demographic","aca","isogram","moOse"};
		
		//for method isogram = true return true statement else return false statement
		for(int q=0;q<keyWord.length;q++) {
			if(isogram(keyWord[q])){
			System.out.println(keyWord[q]+" _ _ _ true");		
			}else {
				System.out.println(keyWord[q]+" _ _ _ false");
			}
			
		}
		
		
	}
	
	// method to loop through words
	public static boolean isogram(String check) {
		int variableLenght ;
		
		if(check.length()<2) {
			return true;
		}
		
		variableLenght = check.length();
		String keyWord1_l=check.toLowerCase();
			for(int x=0;x<=variableLenght;x++) {
			
			
			for (int a=(x+1);a<variableLenght;a++) {
				if(keyWord1_l.charAt(x)==keyWord1_l.charAt(a)) {
					return false;
				}
			}
		
	}
		return true;
		
		
	} 
}