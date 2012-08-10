import java.io.File;
 
public class Display{
 
	public static void main (String args[]) {
 
		displayIt(new File("/opt/hadoop/htdocs/eclipse/Exist/src/input"));
	}
 
	public static void displayIt(File node){
 
	
 
		if(node.isDirectory()){
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
		}
		else
		{
			System.out.println(node.getAbsoluteFile());
		}
 
	}
}
