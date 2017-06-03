import java.io.*;

public class MASetAnw {
	
	public static void main(String[] args)throws IOException{
		MASet a = new MASet();
		FileReader pe1 = new FileReader("MASCH.TXT");
		BufferedReader br1 = new BufferedReader(pe1);
		
		String[] tmenge_str;
		String[] hmenge_str;
		
		
		a.dat2hset(br1);
		a.dat2tset(br1);
		
		tmenge_str = new String[a.set2String(1).length];
		a.set2String(1);
		
		hmenge_str = new String[a.set2String(2).length];
		a.set2String(2);
		
		
		
	}
	
	
}
