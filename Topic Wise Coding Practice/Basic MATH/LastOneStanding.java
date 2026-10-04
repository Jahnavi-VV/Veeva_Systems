import java.util.*;
class LastOneStanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
int sum=0;
while(a>0){
int rem=a%10;
sum+=rem;
a/=10;

while(sum>10){
int r=sum%10;
sum+=r;
sum/=10;}}
System.out.println(sum);
    }
}