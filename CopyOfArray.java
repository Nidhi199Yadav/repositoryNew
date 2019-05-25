import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize=obj.nextInt();
		int [] arr=new int[arrSize];
		int [] arr1=new int[arrSize];
		System.out.println("Enter values:");
		for(int i=0;i<arrSize;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arrSize;i++)
		{
			arr1[i]=arr[i];

		}
		System.out.println("copy of array:");
		System.out.println(Arrays.toString(arr1));

	}

}
