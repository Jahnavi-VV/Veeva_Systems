import java.util.Scanner;
import java.util.HashMap;
class FirstRepeatingInt_Built_in{
public static void main(String args[]){
HashMap<Integer,Integer> map=new HashMap<>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int num:arr){
map.put(num,map.getOrDefault(num,0)+1);}
for(int num:arr){
if(map.get(num)>1){
System.out.println(num);
break;}
}
}}