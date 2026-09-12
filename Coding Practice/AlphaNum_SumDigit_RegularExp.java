import java.util.Scanner;
import java.util.regex.*;
class AlphaNum_SumDigit_RegularExp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int sum=0;
Pattern p=Pattern.compile("\\d+");
Matcher m=p.matcher(s);
while(m.find()){
int num=Integer.parseInt(m.group());
sum+=num;}
System.out.println(sum);
}}