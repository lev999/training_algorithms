package task_1_8;

//1.8 Assume you have a method isSubstring which
// checks if one word is a substring of another.
// Given two strings, s1 and s2, write code to
// check if s2 is a rotation of s1 using only
// one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).

public class RunAppl {

    public static void main(String[] args) {

        String s1="waterbottle";
        String s2 = "erbottlewat";

        System.out.println(isRotated(s1,s2));
    }

    private static boolean isRotated(String s1,String s2) {
        if(s1.length()==s2.length()){

                    StringBuffer ss=new StringBuffer(s1);
            ss.append(s1);
            isSubstring(ss.toString(), s1);
        }

        return false;
    }

    private static void isSubstring(String str1,String str2 ){

    }
}
