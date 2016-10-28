package exam;

import java.util.HashMap;

public class Excelsheet {

	public int titleToNumber(String title) {
		if (title == null || title.length() == 0) {
			throw new IllegalArgumentException("Not valid!");
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c = 'A';
		for (int i = 1; i <= 26; i++) {
			map.put(c, i);
			c = c+ 1;
		}

		int result = 0;
		int i = title.length() - 1;
		int t = 0;
		while (i >= 0) {
			char cr = title.charAt(i);
			result = result + (int) Math.pow(26, t) * map.get(cr);
			t++;
			i--;
		}

		return result;
	}

	public static void main(String args[]) {

		Excelsheet es = new Excelsheet();
		System.out.println(es.titleToNumber("AJ"));

	}
}
