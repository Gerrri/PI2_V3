import java.io.*;

public class MASetAnw {
	
	public static void main(String[] args)throws IOException{
		MASet a = new MASet();
		MASet b = new MASet();
	
		FileReader pe1 = new FileReader("MASCH2.TXT");
		BufferedReader br1 = new BufferedReader(pe1);
		
		FileReader pe2 = new FileReader("MASCH2.TXT");
		BufferedReader br2 = new BufferedReader(pe2);
		
		String[] tmenge_str;
		String[] hmenge_str;
		
		b.dat2tset(br2);
		a.dat2hset(br1);
		
		// TMENGE !!############
		tmenge_str = new String[b.set2String(1).length];
		tmenge_str = b.set2String(1);
		
		System.out.println("##### STRAT Tmenge #####");
		maschAus(tmenge_str,"TmengeAus");
		System.out.println("##### ENDE  Tmenge #####");
		
		
		
		// HMENGE !!############
		hmenge_str = new String[a.set2String(2).length];
		hmenge_str = a.set2String(2);
		
		System.out.println("##### STRAT Hmenge #####");
		maschAus(hmenge_str,"HmengeAus");
		System.out.println("##### ENDE  Hmenge #####");
		
	}
	
	static int maschAus(String MaschS[],String das)throws IOException{
		if(das==null){
			for (int i=0;i<MaschS.length;i++){
				System.out.println(MaschS[i]);
			}
		}
		
		else{
			
			FileWriter fw1 = new FileWriter(das+".txt");
			PrintWriter pr1 = new PrintWriter(fw1);
			
			for (int i=0;i<MaschS.length;i++){
				System.out.println(MaschS[i]);
				pr1.println(MaschS[i]);
				
			}
			
			pr1.close();
			
			
			
		}
		
		return 0;
	}
}
