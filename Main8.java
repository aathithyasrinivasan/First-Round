import java.util.Scanner;
class Main8
{
    public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number of Elements to be in Array");
		int n=scn.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
        System.out.println("The given Array is");
		System.out.println("------------------");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
        for(int i=0;i<a.length;i++)
		{
            for(int j=i+1;j<a.length;j++)
			{
                if(a[j]>a[i])
				{
                int temp =a[j];
                a[j]=a[i];
                a[i]=temp;
                }
            }
        } 
	    System.out.println();
        System.out.println("The Second Largest Value is :"+a[1]);
		System.out.println("The Largest Value is :"+a[0]);
    }
}