package sp;

import java.util.Scanner;

public class Twomatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,r,a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of rows and cloumn=");
		r=in.nextInt();
		c=in.nextInt();
		int first[][]=new int[r][c];
		int second[][]=new int[r][c];
		int sum[][]=new int[r][c];
		
		System.out.println("enter the element of 1st matrix=");
		for(a=0;a<r;a++)
			for(b=0;b<c;b++)
				first[a][b]=in.nextInt();
		System.out.println("enter the element for second matrix=");
		
		for(a=0;a<r;a++)
			for(b=0;b<c;b++)
				second[a][b]=in.nextInt();
		for(a=0;a<r;a++)
			for(b=0;b<c;b++)
				sum[a][b]=first[a][b]+second[a][b];
		System.out.println("sum of two matrices");
		for(a=0;a<r;a++)
		{
			for(b=0;b<c;b++)
		System.out.println(sum[a][b]+"\t");
			System.out.println();
	}

}
}
