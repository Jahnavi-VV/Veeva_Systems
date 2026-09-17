import java.util.Scanner;
class NextPrime{
static boolean isPrime(int n){
if(n<2){
return false;
}
if(n==2||n==3){
return true;
}
if(n%2==0){
return false;
}
for(int i=3;i*i<=n;i+=2){
if(n%i==0){
return false;
}
}
return true;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n+1;
while(!isPrime(num)){
num++;
}
System.out.println(num);
}
}
/*NOTE:Start from n+1, keep checking numbers for prime, and return the first number that is prime.*/