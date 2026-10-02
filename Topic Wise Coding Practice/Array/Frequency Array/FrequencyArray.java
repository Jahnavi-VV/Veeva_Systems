import java.util.Scanner;
class FrequencyArray{
static void frequency(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
for(int i=0;i<freq.length;i++){
if(freq[i]>0){
System.out.println(i+" -> "+freq[i]);
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
frequency(arr);
}
}
