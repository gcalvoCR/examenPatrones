package main;

import java.util.ArrayList;
import java.util.Collections;

public class Analytics {

	public static String[] masLarga(String text) {
		int max = 0;
		String[] parts = text.split(" ");
		ArrayList<String> list = new ArrayList<>();

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

		Collections.sort(list);
		int cantidad = list.size();
		String[] myList = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			myList[i] = list.get(i);
		}

		return myList;
	}

	public static String[] masCorta(String text) {
		int min = 1000;
		String[] myList;
		if (text.length() == 0) {
			myList = new String[1];
			myList[0] = "";

		} else {

			String[] parts = text.split(" ");
			ArrayList<String> list = new ArrayList<>();

			for (String x : parts) {
				if (x.length() < min) {
					min = x.length();
				}
			}

			for (String x : parts) {
				if (x.length() == min) {
					list.add(x);
				}
			}
			Collections.sort(list);
			System.out.println(list.toString());

			int cantidad = list.size();
			myList = new String[cantidad];

			for (int i = 0; i < cantidad; i++) {
				myList[i] = list.get(i);
			}

		}
		return myList;

	}
}
