package src.SchildtWork.Part8Exercises;

public class StringBack {
    public static void main(String[] args) {
        String s = "abcde";
        String d = "abcd";
//        StringBuffer reversed = new StringBuffer(s).reverse();
//        System.out.println(reversed);

        int strLength = s.length();
        String result = "";
        for (int i = 0; i < strLength; i++) {
            result = s.charAt(i) + result;
        }

        System.out.println(result);

        System.out.println(reverseWithRecursion(d));

        String newString = reverseWithRecursion(d);

        String newS =  reverseWithRecursion(newString);
        System.out.println(newS);
    }

    public static String reverseWithRecursion(String ss) {
        String left;
        String right;
        int length = ss.length();

        if (length <= 1) {
            return ss;
        }

        left = ss.substring(0, ss.length() / 2);
        right = ss.substring(ss.length() / 2, ss.length());

        return reverseWithRecursion(right) + reverseWithRecursion(left);
    }


}
