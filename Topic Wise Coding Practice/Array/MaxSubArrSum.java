import java.util.Scanner;
class MaxSubArrSum{
static int maxSubarraySum(int[]arr){
int current=arr[0];
int max=arr[0];
for(int i=1;i<arr.length;i++){
current=Math.max(arr[i],current+arr[i]);
max=Math.max(max,current);
}
return max;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(maxSubarraySum(arr));
}
}