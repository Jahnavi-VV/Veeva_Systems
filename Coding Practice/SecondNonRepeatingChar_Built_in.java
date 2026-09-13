import java.util.*;
class SecondNonRepeatingChar_Built_in {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
  int count = 0;
for (int i = 0; i < s.length(); i++) {
  char ch = s.charAt(i);
  if (map.get(ch) == 1) {
   count++;
 if (count == 2) {
 System.out.println(ch);
break;
}}}}}