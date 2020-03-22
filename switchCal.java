import java.util.Scanner;

public class switchCal{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	float x=sc.nextFloat();

	System.out.println("Enter another number");
	float y=sc.nextFloat();
	
	System.out.println("Input an operator");
	char op=sc.next().charAt(0);	

switch(op){
	case '+':
	System.out.println(x+y);
	break;		

	case '-':
	System.out.println(x-y);
	break;

	case '*':
	System.out.println(x*y);
	break;

	case '/':
        if(y!=0)
	System.out.println(x/y);
	else
	System.out.println("Divided by zero");
	break;

	default:
	System.out.println("Invalid operator");

	}
}
}


















