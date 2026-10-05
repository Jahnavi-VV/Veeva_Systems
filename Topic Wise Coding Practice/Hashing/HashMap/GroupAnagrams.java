import java.util.*;
class GroupAnagrams{
static void group(String[]words){
HashMap<String,ArrayList<String>>map=new HashMap<>();
for(String word:words){
char[]arr=word.toCharArray();
Arrays.sort(arr);
String key=new String(arr);
map.putIfAbsent(key,new ArrayList<>());
map.get(key).add(word);
}
for(ArrayList<String>group:map.values()){
System.out.println(group);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[]words=new String[n];
for(int i=0;i<n;i++){
words[i]=sc.next();
}
group(words);
}
}