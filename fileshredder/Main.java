package saferemoval;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
  String tmp = JOptionPane.showInputDialog("Inserisci il percorso del file");
  ToRemove t = new ToRemove();
  t.secureDelete(tmp);
	}
}
