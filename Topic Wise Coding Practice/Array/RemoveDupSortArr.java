import java.util.Scanner;
class RemoveDupSortArr{
static void removeDuplicates(int[]arr){
int j=0;
for(int i=1;i<arr.length;i++){
if(arr[i]!=arr[j]){
j++;
arr[j]=arr[i];
}
}
for(int i=0;i<=j;i++){
System.out.print(arr[i]+" ");
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
removeDuplicates(arr);
}
}