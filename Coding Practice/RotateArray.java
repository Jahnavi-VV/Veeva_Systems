import java.util.Scanner;
class RotateArray{
static void rotate(String[]arr,int k){
int n=arr.length;
k=k%n;
for(int r=0;r<k;r++){
String last=arr[n-1];
for(int i=n-1;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=last;
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[]arr=new String[n];
for(int i=0;i<n;i++){
arr[i]=sc.next();
}
int k=sc.nextInt();
rotate(arr,k);
for(String s:arr){
System.out.print(s+" ");
}
}
}