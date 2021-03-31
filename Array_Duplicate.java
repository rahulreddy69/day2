package p1;
import java.util.Scanner;

public class Array_Duplicate {
	public static void main(String[] args)
	{
		Array_Duplicate app= new Array_Duplicate();
		int n=10;
		int arr[]=new int[n];
		int arr1[]=new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (int i=0;i<10;i++)
		{
			
			arr[i]= sc.nextInt();
		}
		
		
		arr = app.sortArray(arr, 10);
		arr1 = app.findDuplicate(arr, arr1, 10);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		sc.close();
	}
	
	public int[] sortArray(int arr[], int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public int[] findDuplicate(int arr[], int arr1[], int n)
	{
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr1[j] = arr[i];
				j++;
			}
		}
		if(arr[n-1] != arr[n-2]);
		{
			arr1[j] = arr[n-1];
		}
		return arr1;
	}

}
