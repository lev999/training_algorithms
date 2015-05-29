package book;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] arg) {
		System.out.println("result: " + isAnagrams("qwe", "q$w"));
		System.out.println("Dubl2: "+isAnagrams2("qwe", "qew"));
	}

	public static boolean isAnagrams(String a, String b) {
		boolean[] arr = new boolean[256];
		if (a.length() != b.length())
			return false;
		for (char chA : a.toCharArray()) {
			arr[chA] = true;
		}
		for (char chB : b.toCharArray())
			if (!arr[chB])
				return false;
		return true;
	}
	public static boolean isAnagrams2(String a, String b) {
		char[] arrA=a.toCharArray();
		Arrays.sort(arrA);
		char[] arrB = b.toCharArray();
		Arrays.sort(arrB);
		return arrA==arrB;
	}
}
