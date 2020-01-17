package org.amalitech.calsscode_09_01_2020;

//import java.util.Scanner;

public class ClassCode_09_01_2020 {

	public static void main(String[]args) {
		
		int variableLenght, n=1;
		
		// my own try before i got stuck
		
		String keyWord="ana";
		
		//create empty string compareVariable and assign first letter of input string
		String compareVariable ; 
		//length of word stored in variable 
		variableLenght = keyWord.length();
		
		//loop through the entered keyword from first to last
		for(int x=0;x<variableLenght;x++) {
			
			//if keyword.substring(n) equals (compareVariable) {true: output "True"}
			compareVariable=keyWord.substring(n,(n+1));
			
			if((keyWord.substring(x,(n+1))).equals(compareVariable)) {
				System.out.println(keyWord+"  .... false");
			
			}else {
				System.out.println("true");
				}
			
		}
		
		//else continue compare 
		
	}
	
	}

