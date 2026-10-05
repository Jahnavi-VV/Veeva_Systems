import java.util.*;
class SwapStrings{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

int space=s.indexOf(" ");

String s1=s.substring(0,space);
String s2=s.substring(space+1);

s1=s1+s2;
s2=s1.substring(0,s1.length()-s2.length());
s1=s1.substring(s2.length());

System.out.println(s1+" "+s2);
}
}