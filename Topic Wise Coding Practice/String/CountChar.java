import java.util.*;
class CountChar{
static int countChars(String a){
String a1=a.replaceAll(" ","");
char ch[]=a1.toCharArray();
int r=ch.length;
return r;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(countChars(s));
}
}