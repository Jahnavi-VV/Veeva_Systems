import java.util.HashMap;
import java.util.Scanner;
class FreqWord_InString{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++){
arr[i]=sc.next();}
HashMap<String,Integer>map=new HashMap<>();
for(String str:arr){
if(map.containsKey(str)){
map.put(str,map.get(str)+1);
}else{
map.put(str,1);
}
}
System.out.println(map);
}
}