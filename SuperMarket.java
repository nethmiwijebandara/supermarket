import java.util.Scanner;

public class SuperMarket{
public static void main (String[] args){

Scanner sc=new Scanner (System.in);
Scanner scItem=new Scanner (System.in);
Scanner scInt=new Scanner (System.in);


int a=50; int b=100; int c=20; int total=0;
int qa=1000; int qb=1000; int qc=1000;


//.............................. Input the number of item types.................................

	System.out.println("Enter the number of item types you want:");
	int j= scItem.nextInt();

//.............................. Input the Quantity of items.................................


	for(int i=1;i<=j;i++){
	System.out.println("Enter the item type: a or b or c");
		char type=sc.next().charAt(0);

	if  (type=='a' || type=='A') {

		System.out.println("Enter the Quantity of "+type+" item: ");
		int qtyA=  scInt.nextInt();

		int pa=qtyA*a; 
		total+=pa;
		qa-=qtyA;
		}

	else if (type=='b' || type=='B')	{

		System.out.println("Enter the Quantity of "+type+" item: ");
		int qtyB=  scInt.nextInt();

		int pb=qtyB*b; 
		total+=pb; 
		qb-=qtyB;
		}
		
		else{

		System.out.println("Enter the Quantity of "+type+" item: ");
		int qtyC=  scInt.nextInt();

	
		int pc=qtyC*c;
		total+=pc; 
		qc-=qtyC;
		}
		
	}

//.................................. Print the total...........................................

	
	System.out.println();
	System.out.println("Total price of the items = "+total);


//........................Display the remaining quantity..........................

	System.out.println();
	System.out.println("The remaining quantity:");
	
	System.out.println("Item a : "+qa);
	System.out.println("Item b : "+qb);
	System.out.println("Item c : "+qc);


}
}











