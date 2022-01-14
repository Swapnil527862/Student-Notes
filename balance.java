package abc;
import java.util.Scanner;


class balance {
static int swapnil ;
static void print()
{
	int a=10; int b=20;
	System.out.println("print value"+(a+b));
}

public static void main(String[] args) {

	
		int a,w ,balance=20000;
		System.out.println("please enter your pin");
		Scanner sc=new Scanner(System.in);
		swapnil=sc.nextInt();
		
		if (swapnil==1234) {
		System.out.println("enter any one operation");
		System.out.println("1 ). withdraw");
		System.out.println("2). view balance");
		System.out.println("3). Deposit");
		a=sc.nextInt();

		switch (a)
		{
		case 1:
			System.out.println("withdraw amt");
			w=sc.nextInt();
			int c;
			System.out.println(c=balance-w);
			System.out.println("your remaining balance is ::"+c);
			System.out.println("you have sucessfully withdraw :: "+w);
			break;	
		case 2: 
			
	System.out.println("your balance is now "+balance);
		case 3: System.out.println("Enter amt to deposit");
		int d=sc.nextInt();
	System.out.println("Deposit Done  your balance is :::"  +" "+(balance+d));
				}}else {System.out.println("sorry you enterered wrong pin");
		}}}
