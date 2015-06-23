package task_1_5;

public class ReplaceAllSpaces {

	public static void main(String[] arg) {
		String str = "12  vxcv ";
		System.out.println("replace1 " + replace1(str));
		System.out.println("replace2 " + replace2(str));
	}

	public static String replace1(String str) {
		if(str==null)return "";
		return str.replaceAll(" ", "%20");
	}

	public static String replace2(String str) {
		if(str==null)return "";
		char[] charArr = str.toCharArray();
		int spacesCount = 0;
		for (char a : charArr)
			if (a == ' ')
				spacesCount++;
		int finalLength = charArr.length + spacesCount * 3;
		char[] finalCharArray = new char[finalLength];
		int j = 0;
		for (int i = 0; i < charArr.length; i++) {
			
			if (charArr[i] == ' ') {
				finalCharArray[j] = '%';
				finalCharArray[++j] = '2';
				finalCharArray[++j] = '0';
			} else
				finalCharArray[j] = charArr[i];
			j++;
		}
		return String.valueOf(finalCharArray);
	}
}
