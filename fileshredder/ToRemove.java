package fileshredder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
// Import javax.swing.JOptionPane;

public class ToRemove {
	// Useless constructor method
	//public ToRemove(){}
  public static void secureDelete(String path) throws IOException {
		secureDelete(new File(path));
  }
  public static void secureDelete(File file) throws IOException {
		if (file.exists()){
			// Overwriting the file multiple times
			// Do i have to ask the user how many times?
			// int i = JOptionPane.showInputDialog("?");
			for(int i = 0; i<32; i++){
			long length = file.length();
			SecureRandom random = new SecureRandom();
			RandomAccessFile raf = new RandomAccessFile(file, "rws");
			raf.seek(0);
			raf.getFilePointer();
			byte[] data = new byte[64];
			int pos = 0;
			while (pos < length) {
			random.nextBytes(data);
			raf.write(data);
			pos += data.length;
			}
		raf.close();
		file.delete();
		}
	}
}
}
