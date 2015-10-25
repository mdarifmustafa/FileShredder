package fileshredder;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;

public class Main {
	public static void main(String []args) throws IOException {
	Scanner input = new Scanner(System.in);
  String tmp = JOptionPane.showInputDialog("File path");
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
