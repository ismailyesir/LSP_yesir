package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerHomework {

	public static void main(String[] args) {
		String comp="Goodbye";
		String j = null ;
		do 
		{
			int sum = 0 , product = 1;
			int n = 0;
			String i ;
		System.out.println("String ?");
		Scanner scanner = new Scanner (System.in);
		String sentence = scanner.nextLine();
		if (sentence.equals(comp) == false)
		{ 
			StringTokenizer token = new StringTokenizer(sentence, " ");
			System.out.println("Tokens :");		
			while(token.hasMoreTokens()) 
			{
				i = token.nextToken();
	            n = Integer.parseInt(i);
	            System.out.println(n);
	            sum = sum + n;
				product = product * n;
				
				
			}
			System.out.println("Sum : "+sum);
			System.out.println("Product : "+product);
			
			
		}else 
		{
			System.exit(0);
		}
		}while (comp.equals(j)== false);
		}
		
	}
	
