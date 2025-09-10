package _utils;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ES {
	public static String input(String msg) {
		return showInputDialog(msg);
	}
	public static void print(String msg) {
		showMessageDialog(null, msg);
	}
}
