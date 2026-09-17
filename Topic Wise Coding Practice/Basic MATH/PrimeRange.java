import java.util.Scanner;
class PrimeRange{
static boolean isPrime(int x){
if(x<2){
return false;
}
if(x==2||x==3){
return true;
}
if(x%2==0){
return false;
}
for(int i=3;i*i<=x;i+=2){
if(x%i==0){
return false;
}
}
return true;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("1. Print primes from 1 to N");
System.out.println("2. Print primes from M to N");
int choice=sc.nextInt();
if(choice==1){
int n=sc.nextInt();
for(int i=1;i<=n;i++){
if(isPrime(i)){
System.out.print(i+" ");
}
}
}else if(choice==2){
int m=sc.nextInt();
int n=sc.nextInt();
for(int i=m;i<=n;i++){
if(isPrime(i)){
System.out.print(i+" ");
}
}
}else{
System.out.println("Invalid choice");
}
}
}