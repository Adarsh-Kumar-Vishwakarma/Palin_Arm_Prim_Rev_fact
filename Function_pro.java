package Adarsh;

import java.util.Scanner;

class Function_pro {
    int n,i,j,count,fact=1,rev=0;
	Scanner sc = new Scanner(System.in);
    public static void main(String args[ ]) {	
    	Function_pro ob=new Function_pro();
        ob.prime();
        ob.factorial();
        ob.reverse();
}
 public void prime()
 {   System.out.println("Enter the number");
	 n = sc.nextInt();
	 System.out.println("The prime number is");
	 for(i=1;i<=n;i++) {
		 count=0;
		 for(j=1;j<=i;j++) {
			 if(i%j==0) {
					count++;
				}			
		 }
	 if(count==2) {
		 System.out.print(i + " ");
	 }
	 }
	 System.out.println();
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
		System.out.println("Reverse no is "+ rev);
 }
 

}

 


