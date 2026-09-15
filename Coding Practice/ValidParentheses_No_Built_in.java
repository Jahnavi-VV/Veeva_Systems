import java.util.Scanner;
class ValidParentheses_No_Built_in{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[]stack=new char[s.length()];
int top=-1;
boolean valid=true;
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(ch=='('||ch=='{'||ch=='['){
top++;
stack[top]=ch;
}else{
if(top==-1){
valid=false;
break;
}
char open=stack[top];
top--;
if((ch==')'&&open!='(')||(ch=='}'&&open!='{')||(ch==']'&&open!='[')){
valid=false;
break;
}
}
}
if(top!=-1){
valid=false;
}
System.out.println(valid);
}
}