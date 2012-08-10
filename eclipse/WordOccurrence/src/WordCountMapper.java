import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.FileSplit;


public class WordCountMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, Text>
{

 
  private Text word = new Text();

@Override
public void map(LongWritable arg0, Text arg1,
		OutputCollector<Text, Text> arg2, Reporter arg3)
		throws IOException {
	// TODO Auto-generated method stub
	String filename = new String();
	String filex = new String();
	
	

	String line = arg1.toString();
    StringTokenizer itr = new StringTokenizer(line.toLowerCase());
    while(itr.hasMoreTokens()) {
    	
    	filename =  ((FileSplit)arg3.getInputSplit()).getPath().toString();
    	String[] partsCollArr;
        String delimiter = "/";  
        partsCollArr = filename.split(delimiter); 
        filex=partsCollArr[7];
         Text one = new Text(filex);
    	arg1.set(itr.nextToken());
    	arg2.collect(arg1, one);
  	
    }
}
}