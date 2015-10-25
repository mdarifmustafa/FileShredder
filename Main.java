package saferemoval;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
  String tmp = input.nextLine();
  ToRemove t = new ToRemove();
  t.secureDelete(tmp);
	}
}
