import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MASet {
	TreeSet<MaschineS> tmenge;
	HashSet<MaschineS> hmenge;
	
	MASet(){
		
	}
	

	int dat2tset(BufferedReader br1) throws IOException {
		String pz = br1.readLine();
		MaschineS s;
		int rtn = 0;
		while (pz != null) {
			s = new MaschineS(pz);
			if (s.getCrt() == 1) {
				tmenge.add(s);
				rtn++;
			}
			pz = br1.readLine();
		}
		return rtn;
	}

	int dat2hset(BufferedReader br1) throws IOException {
		String pz = br1.readLine();
		MaschineS s;
		int rtn = 0;
		while (pz != null) {
			s = new MaschineS(pz);
			if (s.getCrt() == 1) {
				hmenge.add(s);
				rtn++;
			}
			pz = br1.readLine();
		}
		return rtn;
	}

	String[] set2String(int a) {
		int i=0;
		String[] Str_Ar;
		
		
		if (a==1){ //tmenge to string[]
			Str_Ar = new String[tmenge.size()];
			
			for(Iterator<MaschineS> it = tmenge.iterator();it.hasNext();i++){
				Str_Ar[i] = it.next().ausMaschCSV();
			}
		}
		
		else if(a==2){ //hmenge to string[]
			Str_Ar = new String[hmenge.size()];
			
			for(Iterator<MaschineS> it = hmenge.iterator();it.hasNext();i++){
				Str_Ar[i] = it.next().ausMaschCSV();
			}
		}
		
		return Str_Ar;
	}
}
