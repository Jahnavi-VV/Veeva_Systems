import java.util.*;

class SortCharFrequency{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

HashMap<Character,Integer>map=new HashMap<>();

for(char ch:s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
}

String result="";

while(!map.isEmpty()){

char maxChar=' ';
int max=0;

for(char key:map.keySet()){
if(map.get(key)>max){
max=map.get(key);
maxChar=key;
}
}

for(int i=0;i<max;i++){
result=result+maxChar;
}

map.remove(maxChar);
}

System.out.println(result);
}
}