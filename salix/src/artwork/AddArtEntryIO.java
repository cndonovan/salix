package artwork;

import java.io.*;

public class AddArtEntryIO {
	public static void add(String filepath, String artEntry) throws IOException{
		File file = new File(filepath);
		PrintWriter out = new PrintWriter(new FileWriter(file, true));
		out.println(artEntry);
		out.close();
		
	}
}
