import java.util.Scanner;
class FrequencyCount{
static int distinctCount(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
int count=0;
for(int i=0;i<freq.length;i++){
if(freq[i]>0){
count++;
}
}
return count;
}
static int countKFrequency(int[]arr,int k){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
int count=0;
for(int i=0;i<freq.length;i++){
if(freq[i]==k){
count++;
}
}
return count;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("1. Count Distinct Elements");
System.out.println("2. Count Elements Occurring K Times");
int choice=sc.nextInt();
if(choice==1){
System.out.println(distinctCount(arr));
}else if(choice==2){
int k=sc.nextInt();
System.out.println(countKFrequency(arr,k));
}else{
System.out.println("Invalid choice");
}
}
}