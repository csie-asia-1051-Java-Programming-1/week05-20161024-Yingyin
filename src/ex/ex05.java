package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

public class ex05 {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	int [][] arr=new int[11][11];
	Random random=new Random();
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			arr[i][j]=random.nextInt(10);
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
	}
		int temp;
		for(int  i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

