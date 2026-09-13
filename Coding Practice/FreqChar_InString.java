import java.util.HashMap;
import java.util.Scanner;
class FreqChar_InString{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
HashMap<Character,Integer>map=new HashMap<>();
for(char ch:s.toCharArray()){
if(map.containsKey(ch)){
map.put(ch,map.get(ch)+1);
}else{
map.put(ch,1);
}
}
System.out.println(map);
}
}