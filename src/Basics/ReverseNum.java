package Basics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=0;
		while(num!=0)
		{
			temp=temp*10+num%10;
			num=num/10;
			
		}
		System.out.println(temp);

	}

}
