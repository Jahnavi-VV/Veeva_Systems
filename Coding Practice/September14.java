import java.util.Scanner;
class September14{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
int feb=28;
if (year%400==0 || (year%4==0 && year%100!=0)){
feb=29;
}
int days=31 + feb + 31 + 30 + 31 + 30 + 31 + 31+13;
int rem=days%7;
if(rem==0){
System.out.println("Monday");}
else if(rem==1){
System.out.println("Tuesday");}
else if(rem==2){
System.out.println("Wednesday");}
else if(rem==3){
System.out.println("Thursday");}
else if(rem==4){
System.out.println("Friday");}
else if(rem==5){
System.out.println("Saturday");}
else if(rem==6){
System.out.println("Sunday");}
}
}
