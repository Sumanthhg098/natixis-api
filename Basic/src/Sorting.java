
package junit.com.demo;

import java.util.Scanner;

public class Sorting {
	
	public int[] check(int arr[])
	{
		int i =arr.length;
		int arr1[] = new int[i];
		for(int j=0;j<=i-1;j++)
		{
			if(arr[j]>arr[j+1]) {
				arr1[j]=arr[j+1];
			}
			else
			{
				arr1[j]=arr[j];
			}
		}
		return arr1;
	}
	
	public static void main(String args)
	{
		Scanner a = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=a.nextInt();
			
		}
		Sorting s = new Sorting();
		int arr2[]=s.check(arr);
		System.out.println(arr2);
	}
}
