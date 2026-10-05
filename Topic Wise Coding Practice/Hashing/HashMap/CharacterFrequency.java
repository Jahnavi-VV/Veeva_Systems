import java.util.*;
class CharacterFrequency{
static void frequency(String s){
HashMap<Character,Integer>map=new HashMap<>();
for(char c:s.toCharArray()){
map.put(c,map.getOrDefault(c,0)+1);
}
for(Map.Entry<Character,Integer>e:map.entrySet()){
System.out.println(e.getKey()+" -> "+e.getValue());
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
frequency(s);
}
}