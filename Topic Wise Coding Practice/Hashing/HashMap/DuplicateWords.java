import java.util.*;
class DuplicateWords{
static void findDuplicates(String s){
String[]words=s.split(" ");
HashMap<String,Integer>map=new HashMap<>();
for(String word:words){
map.put(word,map.getOrDefault(word,0)+1);
}
for(Map.Entry<String,Integer>e:map.entrySet()){
if(e.getValue()>1){
System.out.println(e.getKey());
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
findDuplicates(s);
}
}