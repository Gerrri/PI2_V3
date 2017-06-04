import java.io.*;
import java.util.*;



public class MaschSerAnw {
	
	public static void main (String[] args) throws IOException{	
		FileReader pe1 = new FileReader("MASCH.TXT");
		BufferedReader pr1 = new BufferedReader(pe1);
	}
	
	static int maschSerAus(BufferedReader br1, ObjectOutputStream ow1) throws IOException{
		int zaehler = 0;
		String csv = br1.readLine();
		while (csv!=null){
			MaschineSer temp = new MaschineSer(csv);
			ow1.writeObject(temp);
			csv = br1.readLine();
			zaehler++;
		}
		
		
		return zaehler;
	}

	static int maschSerEIN(ObjectInputStream or1, List<MaschineSer> xs3) throws IOException, ClassNotFoundException{
		MaschineSer temp;
		temp = (MaschineSer)or1.readObject();
		xs3.add(temp);
		or1.close();
		return 0;
	}
	
	
	
	
	
}
