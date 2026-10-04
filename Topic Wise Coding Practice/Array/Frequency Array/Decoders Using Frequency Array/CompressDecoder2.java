import java.util.*;
class CompressDecoder2{
public static String decode(String s){
Stack<Integer>numSt=new Stack<>();
Stack<String>strSt=new Stack<>();
int num=0;
String current="";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isDigit(ch)){
num=num*10+(ch-'0');
}
else if(ch=='['){
numSt.push(num);
strSt.push(current);
num=0;
current="";}
else if(ch==']'){
int count=numSt.pop();
String previous=strSt.pop();
String temp="";
for(int j=0;j<count;j++){
temp+=current;}
current=previous+temp;
}
else{
current+=ch;}
}
return current;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String ch=sc.nextLine();
System.out.println(decode(ch));
}}