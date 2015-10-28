package fileshredder;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

public class Main {
	public static void main(String []args) throws IOException {
		if(args.length == 0){
	  	JFileChooser chooser = new JFileChooser();
	  	chooser.showOpenDialog(null);
			File tmp = chooser.getSelectedFile();
	  	// Check if the string is null to avoid NullPointerException
	  	if(tmp != null){
	  		ToRemove.secureDelete(tmp);
			}
			else{
				System.exit(1);
			}
		}
		else {
			ToRemove.secureDelete(args[0]);
		}
	}
}
