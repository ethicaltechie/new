import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leap  {
  public static void main(String [] args){
  try{
  BufferedReader object = new BufferedReader(
  new InputStreamReader(System.in));
  System.out.println("Enter number");
  int num= Integer.parseInt(object.readLine());
  if(num%4==0)
  {
	  System.out.println("Leap");
  }
  else
  {
	  System.out.println("Not");
  }
  
  }
  catch(Exception e){
  System.out.println("Out of range!");
  }
  }
} 
