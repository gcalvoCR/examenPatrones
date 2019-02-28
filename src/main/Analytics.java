package main;

import java.util.ArrayList;

public class Analytics {

	public static String[] masLarga(String text) {
		int max = 0;
		String[] parts = text.split(" ");
		ArrayList<String> list = new ArrayList();

		for (String x : parts) {
			if (x.length() >= max) {
				max = x.length();
			}
		}

		for (String x : parts) {
			if (x.length() == max) {
				list.add(x);
			}
		}

		int cantidad = list.size();
		String[] myList = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			myList[i] = list.get(i);
		}

		return myList;
	}

}
