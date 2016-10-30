package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int n=sca.nextInt();
	int sum=0,i=0;
	while(true)
	{
		i++;
		sum+=i;
		if(sum>n)
		{
			i--;
			break;
		}
		if(sum==n);
		break;
	}
	System.out.println(i);
	}

}
