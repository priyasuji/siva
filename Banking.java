package sp;

import java.util.Scanner;

public abstract class Banking implements Bank2 {
static int balance=10000;
static int withdraw;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");

	}
	public void bal()
	{
		System.out.println(balance);
	}
	public void withdraw(int x)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount");
		withdraw=s.nextInt();
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("please collect cash");
			System.out.println("balance:"+balance);
		}
		else
		{
			System.out.println("insufficient balance ");
		}
		
	}

}
