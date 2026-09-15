import java.util.Scanner;
class FibonacciPreviousNext{
static void findPreviousNext(int n){
int a=0;
int b=1;
while(b<n){
int c=a+b;
a=b;
b=c;
}
if(b==n){
System.out.println("Previous = "+a);
System.out.println("Next = "+(a+b));
}else{
System.out.println("Not a Fibonacci number");
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
findPreviousNext(n);
}
}