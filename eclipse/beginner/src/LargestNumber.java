import java.io.*;

public class LargestNumber {

	public static void main(String[] args)
	{
		try
		{
		int a,b,c;
     	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     	
     	System.out.println("Enter the first value");
     	a=Integer.parseInt(br.readLine());
     	System.out.println("Enter the second value");
     	b=Integer.parseInt(br.readLine());
     	if(a>b)
     	{
     		for(c=b;c<a;c++)
     		{
     			if(c%2==0)
     			{
     				System.out.println(c);
     			}
     		}
     	}
     	else
     	{
     		for(c=a;c<b;c++)
     		{
     			if(c%2==0)
     			{
     				System.out.println(c);
     			}
     		}
     	}
		}
		catch(Exception e)
		{
		
		}
		
	}
}
