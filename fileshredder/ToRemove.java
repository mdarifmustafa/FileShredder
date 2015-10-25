package fileshredder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
public class ToRemove {
	public ToRemove(){}
  public static void secureDelete(String path) throws IOException {
		File file = new File(path);
		if (file.exists()){
			for(int i = 0;i<10; i++){
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
