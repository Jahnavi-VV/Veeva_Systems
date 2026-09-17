import java.util.Scanner;
class LeastPrimeFactor{
static int[] leastPrimeFactor(int n){
int[]lpf=new int[n];
lpf[0]=1;
for(int i=2;i<=n;i++){
for(int j=2;j<=i;j++){
if(i%j==0){
lpf[i-1]=j;
break;
}
}
}
return lpf;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("\n");
int[]lpf=leastPrimeFactor(n);
for(int i=0;i<lpf.length;i++){
System.out.print(lpf[i]+" ");
}
}
}
/*NOTE: For every number, start checking from 2; the first number that divides it is its Least Prime Factor, and if none divides before itself, the number itself is prime.
*/