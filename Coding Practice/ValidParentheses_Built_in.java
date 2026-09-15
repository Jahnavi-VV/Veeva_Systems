import java.util.Stack;
import java.util.Scanner;
class ValidParentheses_Built_in{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Stack<Character>stack=new Stack<>();
boolean valid=true;
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(ch=='('||ch=='{'||ch=='['){
stack.push(ch);
}else{
if(stack.isEmpty()){
valid=false;
break;
}
char top=stack.pop();
if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
valid=false;
break;
}
}
}
if(!stack.isEmpty()){
valid=false;
}
System.out.println(valid);
}
}