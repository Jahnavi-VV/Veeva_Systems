import java.util.Scanner;
class CountWords{
static int countWords(String s){
if(s.length()==0){
return 0;
}
int count=1;
for(int i=1;i<s.length();i++){
char ch=s.charAt(i);
if(ch>='A'&&ch<='Z'){
count++;
}
}
return count;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(countWords(s));
}
}