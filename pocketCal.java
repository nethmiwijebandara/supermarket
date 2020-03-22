import java.util.Scanner;

public class pocketCal{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);				
	System.out.println("Enter a number");
	int x=sc.nextInt();

	System.out.println("Enter another number");
	int y=sc.nextInt();
	
	System.out.println("Input the operator");
	char op=sc.next().charAt(0);				//Variable declaration

if (op=='+')							//String Literals

	System.out.println("The result = "+(x+y));

else {
	
if (op=='-')							
	System.out.println("The result = "+(x-y));

else

if (op=='*')							
	System.out.println("The result = "+(x*y));

else

if (op=='/')							// Data validation
	System.out.println("The result = "+(x/y));


else
	System.out.println("Invalid operator");	

	}
}
}





/*

Enter a number
7
Enter another number
0
Input the operator
/
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at pocketCal.main(pocketCal.java:33)
*/







