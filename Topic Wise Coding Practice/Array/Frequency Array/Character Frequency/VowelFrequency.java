import java.util.Scanner;
class VowelFrequency{
static void count(String s){
s=s.toLowerCase();
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
System.out.println("a = "+freq['a']);
System.out.println("e = "+freq['e']);
System.out.println("i = "+freq['i']);
System.out.println("o = "+freq['o']);
System.out.println("u = "+freq['u']);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
count(s);
}
}