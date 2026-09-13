import java.util.*;
class GroupAnnagram{
public static List<List<String>> groupanagram(String[] strs){
TreeMap<String,List<String>> map=new TreeMap<>();   
for(String s:strs){
char[] chars=s.toCharArray();
Arrays.sort(chars);
String key=new String(chars);
if(!map.containsKey(key)){
map.put(key,new ArrayList<>());
}
map.get(key).add(s);
}
return new ArrayList<>(map.values());}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int n = sc.nextInt();
String[] strs = new String[n];
for (int i = 0; i < n; i++) {
      strs[i] = sc.next();
  }
System.out.println(groupanagram(strs));
}}         /*Note: 
HashMap       → groups can come in any order
LinkedHashMap → groups come in insertion order
TreeMap       → groups come sorted by their keys*/