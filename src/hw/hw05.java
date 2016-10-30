package hw;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	int arr[][]=new int[21][21];
	int num=1,p,q;
	for(int i=1;i<=n;i++)
	{
		p=i;
		for(int j=1;j<i &&p>0;j++)
		{
			arr[p][j]=num++;
			p--;
		}
	}
	int flag=1;
	for(int i=2;i<=n;i++)
	{
		p=n;
		for(int j=i;j<=n&&p>flag;j++)
		{
			arr[p][j]=num++;
			p--;
		}
		flag++;
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
