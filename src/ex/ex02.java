package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105791120 楊鈺瑩
 */

public class ex02 {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	int n=sca.nextInt();
	long sum=1;
	while(n!=0)
	{
		sum*=n;
		n--;
	}
   System.out.println(sum);
	}

}
