package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    int n=sca.nextInt();
    String str="*";
    for(int i=0;i<n;i++)
    {
    	str="*";
    	if(i==0 || i==n-1)
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
