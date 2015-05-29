package book;

public class isUnique {

	public static void main(String[] args) {
		System.out.println(isUnique("abs"));
		System.out.println("123".length());
	}

	private static boolean isUnique(String str) {

		boolean[] arr = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			
			int ascii = str.charAt(i);
			if (arr[ascii])
				return false;
			arr[ascii] = true;
		}

		return true;
	}
}
