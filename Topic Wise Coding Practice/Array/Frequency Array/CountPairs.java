import java.util.Scanner;
class CountPairs{
static int countPairs(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
int pairs=0;
for(int f:freq){
pairs+=f*(f-1)/2;
}
return pairs;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(countPairs(arr));
}
}