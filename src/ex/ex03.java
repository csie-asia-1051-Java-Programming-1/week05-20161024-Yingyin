package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105791120 楊鈺瑩
 */

public class ex03 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	long sum=0,temp;
	for(int i=1;i<=n;i++)
	{
		temp=1;
		for(int j=1;j<=i;j++)
		{
			temp*=2;
		}
		sum+=temp;
	}
	System.out.println(sum);
	}
}

