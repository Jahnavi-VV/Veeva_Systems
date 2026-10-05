import java.util.*;
class HashMapOperations{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
HashMap<Integer,String>map=new HashMap<>();
int n=sc.nextInt();
for(int i=0;i<n;i++){
int key=sc.nextInt();
String value=sc.next();
map.put(key,value);
}
System.out.println(map);
int searchKey=sc.nextInt();
System.out.println(map.get(searchKey));
int checkKey=sc.nextInt();
System.out.println(map.containsKey(checkKey));
int removeKey=sc.nextInt();
map.remove(removeKey);
System.out.println(map);
}
}