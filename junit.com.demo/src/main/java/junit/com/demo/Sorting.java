package junit.com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Sorting {
	
	public int[] check(int arr[])
	{
		Arrays.sort(arr);
		return arr;
	}
	
	public int[] desc(int arr[]) {
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
}
