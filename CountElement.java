import java.util.Scanner;

public class CountElement {

		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter size of array:");
			int n=obj.nextInt();
			int [] arr=new int[n];
			int count=0;
			 
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter" +i+"th elements:");

				arr[i]=obj.nextInt();
				
			}
			System.out.println("Enter value:");
			int val=obj.nextInt();
			for(int i=0;i<n;i++)
			{
				if(arr[i]==val)
				{
					count++;

				}

			}
			System.out.println(+count+ " time this element is available in array");

	}

}
