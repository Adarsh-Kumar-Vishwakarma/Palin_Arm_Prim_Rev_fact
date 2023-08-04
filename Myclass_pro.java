package Adarsh;

import java.util.Scanner;

public class Myclass_pro {
	static int n,a,s,sum=0,rev=0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Myclass_pro ob = new Myclass_pro();
		ob.armstrong();
		ob.palindrome();
       
	}
	public static void armstrong() {
		System.out.println("Enter the number");
	    n =sc.nextInt();
	    s = n;
	    while(n>0) {
	    	a = n%10;
	    	sum = sum + a*a*a;
	    	n = n/10;
	    }
	    System.out.println(n);
	    if(sum==s)
    	{
    		System.out.println("The number is armstrong");
    	}else {
    		System.out.println("The number is not a armstrong");
    	}
	    
	}
	public static  void palindrome() {
		 System.out.println("Enter the number");
		 n = sc.nextInt();
		 s = n;
			while(n>0) {
				a=n%10;
				rev=rev*10+a;
				n=n/10;
			}
		    if(rev==s)
	    	{
	    		System.out.println("The number is palindrome");
	    	}else {
	    		System.out.println("The number is not a palindrome");
	    	}
	 }

}
