package src.SchildtWork.Part8Exercises;

public class StringBack {
    public static void main(String[] args) {
        String s = "abcde";
//        StringBuffer reveresed = new StringBuffer(s).reverse();
//        System.out.println(reveresed);

        int strLength = s.length();
        String result = "";
        for (int i = 0; i < strLength; i++) {
           result = s.charAt(i) + result;
        }

        System.out.println(result);
    }
}
