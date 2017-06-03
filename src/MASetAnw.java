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
		tmenge_str = a.set2String(1);
		maschAus(tmenge_str);
		
		hmenge_str = new String[a.set2String(2).length];
		hmenge_str = a.set2String(2);
		
		
		
		 
		
	}
	
	static int maschAus(String MaschS[])throws IOException{
		for (int i=0;i<MaschS.length;i++){
			System.out.println(MaschS[i]+i);
		}
		
		/*
		if (das != null){
	
		}
		
		else{
			for (int i=0;i<MaschS.length;i++){
				System.out.println(MaschS[i]);
			}
		}
		*/
		
		return 0;
	}
}
