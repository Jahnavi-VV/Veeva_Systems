import java.util.Scanner;
class SmallAbsDiff{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int k=sc.nextInt();
int result=0,ele=0;
int ans=Integer.MAX_VALUE;
for(int i=n-1;i>=0;i--){
result=Math.abs(k-arr[i]);
 if (result < ans) {
 ans = result;
 ele = arr[i];
 }}
System.out.println(ele);
}}