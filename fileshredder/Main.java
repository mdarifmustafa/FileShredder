package fileshredder;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.util.*;

public class Main {
	public static void main(String []args) throws IOException {
		// Scanner for cli version
		//Scanner input = new Scanner(System.in);
  	JFileChooser chooser = new JFileChooser();
  	chooser.showOpenDialog(null);
  	String tmp = chooser.getSelectedFile().getPath();
  	// Check if the string is null to avoid NullPointerException
  	if(tmp != null){
  		ToRemove t = new ToRemove();
  		t.secureDelete(tmp);
		}
		else{
			System.exit(1);
		}
	}
}
