import java.util.*;
class FrequencyHashMap{
static void frequency(int[]arr){
HashMap<Integer,Integer>map=new HashMap<>();
for(int x:arr){
map.put(x,map.getOrDefault(x,0)+1);
}
for(Map.Entry<Integer,Integer>e:map.entrySet()){
System.out.println(e.getKey()+" -> "+e.getValue());
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
frequency(arr);
}
}
