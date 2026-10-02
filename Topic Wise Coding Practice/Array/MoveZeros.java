import java.util.Scanner;
class MoveZeros{
static void moveZeros(int[]arr){
int index=0;
for(int x:arr){
if(x!=0){
arr[index++]=x;
}
}
while(index<arr.length){
arr[index++]=0;
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
moveZeros(arr);
for(int x:arr){
System.out.print(x+" ");
}
}
}