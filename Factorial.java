package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
      int i,n,f=1;
    		  Scanner sc= new Scanner(System.in);
         System.out.println("enter the range");
         n=sc.nextInt();
         for(i=1;i<=n;i++) {
         f=f*i;
         System.out.println("the number"+n+"="+f);
         
        	 
	}
	
	}
	}
