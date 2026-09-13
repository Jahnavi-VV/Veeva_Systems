import java.util.HashMap;
import java.util.Scanner;
class TwoSum{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int target=sc.nextInt();
HashMap<Integer,Integer>map=new HashMap<>();
int[]result={-1,-1};
for(int i=0;i<arr.length;i++){
int required=target-arr[i];
if(map.containsKey(required)){
result[0]=map.get(required);
result[1]=i;
break;
}
map.put(arr[i],i);
}
System.out.println("["+result[0]+", "+result[1]+"]");
}
}