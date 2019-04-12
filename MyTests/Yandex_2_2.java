package MyTests;

public class Yandex_2_2 {
    public static String getRLE(String str)
    {
        if (str == null || str.equals(""))
        {
            return str;
        }
        char currentChar = str.charAt(0);
        int currentCharCount = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++)
        {
            char c = i < str.length() ? str.charAt(i) : 0;
            if (i == str.length() || currentCharCount == 9 || c != currentChar)
            {
                sb.append(currentChar);
                if (currentCharCount > 1)
                {
                    sb.append((char)(currentCharCount + '0'));
                }
                currentCharCount = 1;
                currentChar = c;
            }
            else
            {
                currentCharCount++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = getRLE("A15BA5");
        System.out.println(s);
    }
}
