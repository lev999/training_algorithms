package book;

public class ReverseString {
	public static void main(String[] arg) {

		System.out.println("reverse is :" + reverse("abcdef"));
	}

	public static String reverse(String str) {
		char[] arr = str.toCharArray();
		if (str != null) {
			int a = 0;
			int b = arr.length-1;
			char temp;
			while(a<b){
				temp=arr[a];
				arr[a]=arr[b];
				arr[b]=temp;
				a++;
				b--;
			}
		}
		return new String(arr);
	}
}
