import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MASet {
	TreeSet<MaschineS> tmenge = new TreeSet<MaschineS>();;
	HashSet<MaschineS> hmenge = new HashSet<MaschineS>();;
	
	MASet(){
		
	}
	

	int dat2tset(BufferedReader br1) throws IOException {
		Iterator<MaschineS> it = tmenge.iterator();
		String pz = br1.readLine();
		MaschineS s;
		int rtn = 0,check;
		
		while (pz != null){
			check = 0;
			s = new MaschineS(pz);
			
			for(int i=0;i<tmenge.size();i++){
				if(s.compareTo(it.next())!=0){
					check = -1;
					break; 
				}
			}
			
			
			
			if (s.getCrt() == 1 && check == 0) {
				tmenge.add(s);
				rtn++;
			}
			pz = br1.readLine();
		}
		return rtn;
	}

	
	int dat2hset(BufferedReader br1) throws IOException {
		Iterator<MaschineS> it;
		String pz = br1.readLine();
		MaschineS s,v;
		int rtn = 0, check;

		while (pz != null) {
			check = 0;	
			it = hmenge.iterator();
			s = new MaschineS(pz);

				while (it.hasNext()&& s.getMabez()!=null && s.getStao()!=null && s.getManr()!=0 && s.getPreis()!=0){
					v = it.next();
					
					if(s.compareTo(v)==1){
						check = 1;
						break; 
					}
				}
			
			
			if (s.getCrt() == 1 && check == 0) {
				hmenge.add(s);
				rtn++;
			}
			pz = br1.readLine();
		}
		return rtn;
	}

	String[] set2String(int a) {
		int i=0;
		
		
		if (a==1){ //tmenge to string[]
			String[] Str_Ar = new String[tmenge.size()];
			Iterator<MaschineS> it = tmenge.iterator();
					
			//Str_Ar[0] = tmenge.first().ausMaschCSV();
			
			while (it.hasNext()){
				Str_Ar[i] = it.next().ausMaschCSV();
				i++;
			}
			
			return Str_Ar;
		}
		
		else if(a==2){ //hmenge to string[]
			String[] Str_Ar = new String[hmenge.size()];
			Iterator<MaschineS> it = hmenge.iterator();
			
			while (it.hasNext()){
				Str_Ar[i] = it.next().ausMaschCSV();
				i++;
			}
			
			return Str_Ar;
		}
		
		return null; // fals ungültig!
	}
}
