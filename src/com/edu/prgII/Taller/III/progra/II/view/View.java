package com.edu.prgII.Taller.III.progra.II.view;
/**
 * Andres barrera, javier lopez y Diego Patiño
 * @author Diego Patiño
 *
 */
import java.util.Scanner;
/**
 * Andres barrera, javier lopez y Diego Patiño
 * @author Diego Patiño
 *
 */
public class View {
	private Scanner box = new Scanner(System.in);

	public void showMessage(String message) {
		System.out.println(message);
	}

	public char num() {
		char num = box.nextLine().charAt(0);
		return num;
	}

	public String readString(String message) {
		showMessage(message);
		return box.nextLine();
	}

	public int readInt(String message) {
		showMessage(message);
		int number = Integer.parseInt(box.nextLine());
		return number;

	}

	public boolean readBoolean(int number) {
		boolean x = false;
		if (number == 1) {
			x = true;
			return x;
		}
		return x;
	}

}