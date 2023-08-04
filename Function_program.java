package Adarsh;

import java.util.Scanner;

class pro {
    int n,i,count=0,fact=1,rev=0;
	Scanner sc = new Scanner(System.in);
    public static void main(String args[ ]) {	
        pro ob=new pro();
        ob.prime();
        ob.factorial();
        ob.reverse();
}
 public void prime()
 {    
	 System.out.println("Enter the number.");
		n = sc.nextInt();
	 for(i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}			 
	 }
	 if(count==2) {
		 System.out.println("prime no.");
	 }else {
		 System.out.println("not prime");
	 }
 }
 public void factorial() {
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		
		System.out.println("Factorial of "+ fact);
	}
 public void reverse() {
	 System.out.println("Enter the number");
		n = sc.nextInt();
		while(n>0) {
			i=n%10;
			rev=rev*10+i;
			n=n/10;
		}
		System.out.println("Reverse is "+ rev);
 }
 

}

 


