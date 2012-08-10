import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListOfLeapYears  {
  public static void main(String [] args){
  try{
  BufferedReader object = new BufferedReader(
  new InputStreamReader(System.in));
  System.out.println("Enter number");
  int b= Integer.parseInt(object.readLine());
  int i=0;
 
	  for(;i<b;i++)
	  {
		  if(i%4==0)
		  {
			  System.out.println(i);
		  }
	  }
  
  
  }
  catch(Exception e){
  System.out.println("Out of range!");
  }
  }
} 
