import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Search_word {
	 public static void main(String[] args)
	   { 
	
			 	InputStreamReader ir=new InputStreamReader(System.in);
	                 	BufferedReader br=new BufferedReader(ir);
	                
	             		String sear;
				String directory; 
				try
				{
					System.out.println("Please enter a directory to search");
					directory = br.readLine();
	       			System.out.println("Enter the string:");
	        		sear=br.readLine();
				
					Search f = new Search();  
	                f.traverse(directory,sear);
				}
	 			catch(IOException e)
				 {  
					e.printStackTrace();                
				 }
				 
			  } 
	 
	 
	    public int count = 0;
	    public void traverse(String directory,String word) 
	    {
	     
	      String files;
	      File folder = new File(directory);
	      File[] listOfFiles = folder.listFiles(); 
	  
	      for (int i = 0; i < listOfFiles.length; i++) 
	      {
	 	  	 if (listOfFiles[i].isFile()) 
	 	  	 {
	 	 		  files = listOfFiles[i].getName();
	 	    		  //System.out.println(files);
	 	 		  searchPattern(directory,files,word);
	 	     }
	      }

	 	System.out.println("Word found in "+count+" files");

	    }

	  
	      public void searchPattern(String directory,String file_name,String word)
	      { 
	            try{  
	 		File fw = new File(file_name); 
	 		//System.out.println(fw.exists());  
	 			
	 		BufferedReader pw = new BufferedReader(new FileReader(directory+"/input"+fw)); 
	 		String s = null;  
	 	        
	   		
	 		Pattern p =  Pattern.compile(word);  
	 			
	 			while((s = pw.readLine()) != null)
	 			{    
	 								  
	 			     Matcher m = p.matcher(s);  
	 			     if(m.find())
	 			     {
	 					count ++;
	 					System.out.println("word found in "+fw);
	 			     };
	 								 					   
	 			}
	 				
	 						
	 		}
	 				
	 		catch(IOException e)
	 		{  
	 				 e.printStackTrace();                
	 		}  
	      
	 	 }

}
