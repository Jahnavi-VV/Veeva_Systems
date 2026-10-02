import java.util.Scanner;
class DuplicateElements{
static void findDuplicates(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
for(int i=0;i<freq.length;i++){
if(freq[i]>1){
System.out.print(i+" ");
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
findDuplicates(arr);
}
}