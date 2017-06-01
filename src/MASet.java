import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class MASet {
	TreeSet<MaschineS> tmenge;
	HashSet<MaschineS> hmenge;

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
		String[] Str_Ar = { "0", "a" };
		if (a==1){
			
		}else if(a==2){
			
		}
		return Str_Ar;
	}
}
