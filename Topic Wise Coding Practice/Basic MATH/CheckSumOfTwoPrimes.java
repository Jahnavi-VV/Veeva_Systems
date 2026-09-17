import java.util.Scanner;
class CheckSumOfTwoPrimes{
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
boolean found=false;
for(int i=2;i<=n/2;i++){
if(isPrime(i)&&isPrime(n-i)){
found=true;
break;
}
}
System.out.println(found);
}
}