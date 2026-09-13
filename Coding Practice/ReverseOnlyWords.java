import java.util.*;
class ReverseOnlyWords {
    public static String reversewords(String s) {
        String words[] = new String[s.length()];
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                StringBuilder word = new StringBuilder();
                while (i < s.length() && Character.isLetterOrDigit(s.charAt(i))) {
                    word.append(s.charAt(i));
                    i++;
                }
                words[wordCount++] = word.toString();
            }
            else {
                i++;
            }
        }
         StringBuilder result = new StringBuilder();
        int j = wordCount - 1;
        int i = 0;
        while (i < s.length()) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
            while (i < s.length() &&
            Character.isLetterOrDigit(s.charAt(i))) {
	  i++;
                }
	result.append(words[j--]);
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reversewords(s));
    }
}