import java.util.*;
class HashMapKeySet{
static void display(HashMap<Integer,String>map){
for(int key:map.keySet()){
System.out.println(key+" -> "+map.get(key));
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