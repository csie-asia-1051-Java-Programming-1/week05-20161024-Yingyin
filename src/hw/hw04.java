package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	double sum=0;
	int n=sca.nextInt();
	for(int i=n;i>=1;i++)
	{
		sum+=1.0/((2*i-1)*2*i);
		
	}
	System.out.println(sum);
	}

}
