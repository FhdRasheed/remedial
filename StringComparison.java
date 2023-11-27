package java_fahad;

import java.util.Scanner;

public class StringW3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		
		
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		
		int result=str1.compareToIgnoreCase(str2);
		//System.out.println(result);
		
		if(result<0) {
			System.out.println("String 1 is less than String 2");
		}
		else if(result==0) {
			System.out.println("String 1 is equal to String 2");
		}
		else {
			System.out.println("String 1 is Greater than String 2");
		}


		
	}
	
	

}
