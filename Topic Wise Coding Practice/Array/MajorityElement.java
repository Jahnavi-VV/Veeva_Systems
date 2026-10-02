import java.util.Scanner;
class MajorityElement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int candidate=0;
int count=0;
for(int num:arr){
if(count==0){
candidate=num;
}
if(num==candidate){
count++;
}else{
count--;
}
}
System.out.println(candidate);
}
}