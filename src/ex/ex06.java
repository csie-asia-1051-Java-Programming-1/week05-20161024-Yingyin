package ex;

import java.util.Scanner;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

public class ex06 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int data[]={105791180,105791123,105791129,105791190,10579145,10579110};
    int a=0;
    for(int i=0;i<data.length;i++)
    {
    	for(int j=0;j<data.length;j++)
    	{
    		if(data[i]<data[j])
    		{
    			a=data[i];
    			data[i]=data[j];
    			data[j]=a;
    		}
    	}
    }
    for(int i=0;i<data.length;i++)
    {
    	System.out.print(data[i]+"\t");
    }
	}

}
