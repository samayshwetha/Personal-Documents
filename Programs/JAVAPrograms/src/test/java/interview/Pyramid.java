package interview;

public class Pyramid {

	public static void main(String[] args) {
	    int row=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int k=row;k>i; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<row;i++)
		{
			//for(int k=i;k<row; k++)
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}
