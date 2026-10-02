import java.util.Scanner;
class RotateArrayKtimes{
static void reverse(int[]arr,int l,int r){
while(l<r){
int temp=arr[l];
arr[l]=arr[r];
arr[r]=temp;
l++;
r--;
}
}
static void leftRotate(int[]arr,int k){
k=k%arr.length;
reverse(arr,0,k-1);
reverse(arr,k,arr.length-1);
reverse(arr,0,arr.length-1);
}
static void rightRotate(int[]arr,int k){
k=k%arr.length;
reverse(arr,0,arr.length-1);
reverse(arr,0,k-1);
reverse(arr,k,arr.length-1);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int k=sc.nextInt();
int choice=sc.nextInt();
if(choice==1){
leftRotate(arr,k);
}else if(choice==2){
rightRotate(arr,k);
}else{
System.out.println("Invalid choice");
return;
}
for(int x:arr){
System.out.print(x+" ");
}
}
}