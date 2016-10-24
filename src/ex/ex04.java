package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105791120 楊鈺瑩
 */

public class ex04 {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	int n=sca.nextInt();
	String str="*";
    for(int i=0;i<n;i++)
    {
    	str="*";
    	if (i==0||i==n-1)
    	{
    		for(int j=1;j<n-1;j++)
    			str+="*";
    	}
    	else 
    	{
    		for(int j=1;j<n-1;j++)
    		{
    			str+="*";
    		}
    	}
    	str+="*";
    	System.out.println(str);
    }
	}

}
