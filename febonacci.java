import java.util.*;
import java.lang.*;
import java.io.*;
class Febonacci
 {
	public static void main (String[] args)
	 {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();     //Number of TestCases
	while(t-- >0){          //Loop to perform Number of Testcases
	int n=sc.nextInt();     //Read the n till which Febonacci series is to be printed
	int a=1,b=1;            
	for(int i=0;i<n;i++)
	{
	    System.out.print(a+" ");  
	    if(i+1==n)                
	    break;
	    i++;
	    System.out.print(b+" ");  
	    a=a+b;                    
	    b=a+b;
	}
	System.out.println();     //For NextLine
      	 }
	 }
}
