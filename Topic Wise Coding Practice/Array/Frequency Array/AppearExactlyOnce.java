import java.util.Scanner;
class AppearExactlyOnce{
static void ExactlyOnce(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
for(int x:arr){
if(freq[x]==1){
System.out.print(x+" ");
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
ExactlyOnce(arr);
}
}