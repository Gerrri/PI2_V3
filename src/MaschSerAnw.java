import java.io.*;
import java.util.*;



public class MaschSerAnw {
	
	public static void main (String[] args) throws IOException, ClassNotFoundException{	
		FileReader pe1 = new FileReader("MASCH.TXT");
		BufferedReader pr1 = new BufferedReader(pe1);
		OutputStream os1 = new FileOutputStream("OS.txt");
		ObjectOutputStream os2 = new ObjectOutputStream(os1);
		InputStream is1 = new FileInputStream("OS.txt");
		ObjectInputStream is2 = new ObjectInputStream(is1);
		List<MaschineSer> xs3= new LinkedList<MaschineSer>();
		int output = maschSerAus(pr1, os2);
		int input = maschSerEIN(is2, xs3);
		for (int i =0; i< xs3.size(); i++){
			System.out.print(xs3.get(i).getManr());
			System.out.print(";");
			System.out.print(xs3.get(i).getPreis());
			System.out.print(";");
			System.out.print(xs3.get(i).getMabez());
			System.out.print(";");
			System.out.print(xs3.get(i).getStao());
			System.out.print(";");
			System.out.println("");
		}
	}
	
	static int maschSerAus(BufferedReader br1, ObjectOutputStream ow1) throws IOException, ClassNotFoundException{
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
		int i =0;
		/*temp = (MaschineSer)or1.readObject();
		while (temp != null){
		xs3.add(temp);
		temp = (MaschineSer)or1.readObject();
		}
		or1.close();*/
		try{while(true)
		{temp=(MaschineSer)or1.readObject();
		i++;
		xs3.add(temp);
		}
		}
		catch(EOFException eo1)
		{
		or1.close();
		return i;
	}
	
	
	
	
	
}}