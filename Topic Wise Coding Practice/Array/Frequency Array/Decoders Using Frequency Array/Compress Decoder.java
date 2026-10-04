import java.util.Scanner;
class CompressDecoder{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String r="";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isLetter(ch)){
int j=i+1;
int num=0;
while(j<s.length() && Character.isDigit(s.charAt(j))){
num=num*10+(s.charAt(j)-'0');
j++;}
for(int k=0;k<num;k++){
r+=ch;}
i=j-1;
}}
System.out.println(r);}
}
