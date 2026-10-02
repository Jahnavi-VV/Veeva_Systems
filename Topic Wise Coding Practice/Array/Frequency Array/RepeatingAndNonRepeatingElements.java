import java.util.Scanner;
class RepeatingAndNonRepeatingElements{
static void firstRepeating(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
for(int x:arr){
if(freq[x]>1){
System.out.println(x);
return;
}
}
System.out.println("No repeating element");
}
static void nonRepeating(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
for(int x:arr){
if(freq[x]==1){
System.out.print(x+" ");
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
System.out.println("1. First Repeating Element");
System.out.println("2. Non-Repeating Elements");
int choice=sc.nextInt();
if(choice==1){
firstRepeating(arr);
}else if(choice==2){
nonRepeating(arr);
}else{
System.out.println("Invalid choice");
}
}
}