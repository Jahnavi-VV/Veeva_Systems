import java.util.*;
class HashMapEntrySet{
static void display(HashMap<Integer,String>map){
for(Map.Entry<Integer,String>entry:map.entrySet()){
System.out.println(entry.getKey()+" -> "+entry.getValue());
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
HashMap<Integer,String>map=new HashMap<>();
int n=sc.nextInt();
for(int i=0;i<n;i++){
int key=sc.nextInt();
String value=sc.next();
map.put(key,value);
}
display(map);
}
}