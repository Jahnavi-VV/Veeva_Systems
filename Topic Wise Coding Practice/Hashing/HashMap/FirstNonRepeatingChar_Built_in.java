import java.util.Scanner;
import java.util.HashMap;
class FirstNonRepeatingChar_Built_in{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
HashMap<Character,Integer> map=new HashMap<>();
String s=sc.nextLine();
for (char ch:s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
}
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(map.get(ch)==1){
System.out.println(ch);
break;}}
}
}