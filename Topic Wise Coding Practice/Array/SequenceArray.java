import java.util.Scanner;
class SequenceArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int m1[]=new int[m];
for(int i=0;i<m;i++){
m1[i]=sc.nextInt();
}
int n=sc.nextInt();
int n1[]=new int[n];
for(int i=0;i<n;i++){
n1[i]=sc.nextInt();
}
int j=0;
for(int i=0;i<m;i++){
if(j<n && m1[i]==n1[j]){
j++;}
}

System.out.println(j==n);}}