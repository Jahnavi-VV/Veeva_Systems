import java.util.Scanner;
class Prime{
static boolean isPrime(int n){
boolean prime=true;
if(n<2){
prime=false;
}
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
prime=false;
break;
}
}
return prime;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(isPrime(n));
}
}

/*NOTE: Start with prime = true; check divisors from 2 to √n. If any divides exactly, make prime = false and break.*/