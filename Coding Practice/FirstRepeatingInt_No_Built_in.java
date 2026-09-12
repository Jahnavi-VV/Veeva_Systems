import java.util.Scanner;
class FirstRepeatingInt_No_Built_in{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int freq[]= new int[101];
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int num:arr){
freq[num]++;}
for(int num:arr){
if(freq[num]>1){
System.out.println(num);
break;}
}
}}