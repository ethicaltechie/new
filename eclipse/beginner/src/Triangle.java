import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle  {
  public static void main(String [] args){
  try{
  BufferedReader object = new BufferedReader(
  new InputStreamReader(System.in));
  System.out.println("Enter number");
  int num= Integer.parseInt(object.readLine());
  for(int i=1; i<num;i++)
  {
	  for(int j=0;j<i;j++)
	  {
		  System.out.print("*");
	  }
	  System.out.println(" ");
  }
  }
  catch(Exception e){
  System.out.println("Out of range!");
  }
  }
} 
