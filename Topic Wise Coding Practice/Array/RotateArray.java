import java.util.Scanner;
class RotateArray{
static void leftRotate(int[]arr){
int first=arr[0];
for(int i=0;i<arr.length-1;i++){
arr[i]=arr[i+1];
}
arr[arr.length-1]=first;
}
static void rightRotate(int[]arr){
int last=arr[arr.length-1];
for(int i=arr.length-1;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=last;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("1. Left Rotate");
System.out.println("2. Right Rotate");
int choice=sc.nextInt();
if(choice==1){
leftRotate(arr);
}else if(choice==2){
rightRotate(arr);
}else{
System.out.println("Invalid choice");
return;
}
for(int x:arr){
System.out.print(x+" ");
}
}
}