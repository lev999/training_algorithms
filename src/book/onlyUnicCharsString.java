package book;

public class onlyUnicCharsString {

	public static void main(String[] args) {

		System.out.println("reverse=" + onlyUnicCharsString("abaabb$%^^^$ n  n n"));
	}

	public static String onlyUnicCharsString(String str) {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		boolean[] arr = new boolean[256];
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int chi = (int)ch;
			if(!arr[chi]){
				builder.append(ch);
				arr[chi]=true;
			}
		}

		return builder.toString();
	}
}
