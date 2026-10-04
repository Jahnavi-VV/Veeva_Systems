import java.util.Scanner;
class SubarrayKOdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int k=sc.nextInt();
int O=0;
for(int i=0;i<n;i++){
int count=0;
int j=i;
while(j<n){
if(arr[j]%2!=0){
count++;
j++;
}
else{
j++;
}
if(count==k){
O++;}}
}

System.out.println(O);
}}