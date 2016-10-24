package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105791120 楊鈺瑩
 */

public class ex01 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int n=sca.nextInt();
	long sum=1;
	for(int i=1;i<=n;i++)
	{
		sum*=i;
	}
	System.out.println(sum);
	}

}
