import java.io.*;

public class MASetAnw {
	
	public static void main(String[] args)throws IOException{
		MASet a = new MASet();
		MASet b = new MASet();
		FileReader pe1 = new FileReader("MASCH.TXT");
		BufferedReader br1 = new BufferedReader(pe1);
		
		FileReader pe2 = new FileReader("MASCH.TXT");
		BufferedReader br2 = new BufferedReader(pe1);
		
		String[] tmenge_str;
		String[] hmenge_str;
		
		
		a.dat2hset(br1); // Wenn man hier vertauscht (reihenfolge) geht nichtmal mehr hmenge
		b.dat2tset(br2);
		
		// TMENGE !!############
		tmenge_str = new String[b.set2String(1).length];
		tmenge_str = b.set2String(1);
		
		System.out.println("##### STRAT Tmenge #####");
		maschAus(tmenge_str);
		System.out.println("##### ENDE  Hmenge #####");
		
		
		
		// HMENGE !!############
		hmenge_str = new String[a.set2String(2).length];
		hmenge_str = a.set2String(2);
		
		System.out.println("##### STRAT Hmenge #####");
		maschAus(hmenge_str);
		System.out.println("##### ENDE  Hmenge #####");
		
	}
	
	static int maschAus(String MaschS[])throws IOException{
		for (int i=0;i<MaschS.length;i++){
			System.out.println(MaschS[i]);
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
