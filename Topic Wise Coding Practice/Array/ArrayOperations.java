import java.util.Scanner;
class ArrayOperations{
static void operations(int[]arr){
int max=arr[0];
int min=arr[0];
int sum=0;
int even=0;
int odd=0;
int positive=0;
int negative=0;
int zero=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
if(arr[i]<min){
min=arr[i];
}
sum+=arr[i];
if(arr[i]%2==0){
even++;
}else{
odd++;
}
if(arr[i]>0){
positive++;
}else if(arr[i]<0){
negative++;
}else{
zero++;
}
}
double avg=(double)sum/arr.length;
System.out.println("Maximum = "+max);
System.out.println("Minimum = "+min);
System.out.println("Sum = "+sum);
System.out.println("Average = "+avg);
System.out.println("Even = "+even);
System.out.println("Odd = "+odd);
System.out.println("Positive = "+positive);
System.out.println("Negative = "+negative);
System.out.println("Zero = "+zero);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
operations(arr);
}
}
