import java.util.Scanner;
class MissingNumber{
static int findMissing(int[]arr){
int n=arr.length+1;
int expected=n*(n+1)/2;
int actual=0;
for(int x:arr){
actual+=x;
}
return expected-actual;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(findMissing(arr));
}
}