import java.util.Scanner;
public class Pattern8 {
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter range:");
			int n=sc.nextInt();
			int i,j;
			for(i=0;i<n;i++)
			{
				System.out.println();
				for(j=0;j<n-3;j++)
				{
					if(j==0 || j==n-4 || i==0 || i==n-1 || i==((n-1)/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			sc.close();
		}
	
}
