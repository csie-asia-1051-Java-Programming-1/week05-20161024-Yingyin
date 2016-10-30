package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n=sca.nextInt();
		int ans=1;
		while(n<=10000)
		{
			n*=n;
			ans++;
		}
		System.out.println(ans);
	}

}
