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

public class WordCountMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>
{

  private final IntWritable one = new IntWritable(1);
  private Text word = new Text();

@Override
public void map(LongWritable arg0, Text arg1,
		OutputCollector<Text, IntWritable> arg2, Reporter arg3)
		throws IOException {
	// TODO Auto-generated method stub
	
	String line = arg1.toString();
    StringTokenizer itr = new StringTokenizer(line.toLowerCase());
    while(itr.hasMoreTokens()) {
      arg1.set(itr.nextToken());
      arg2.collect(arg1, one);
    }
}
}