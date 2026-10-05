import java.util.*;
class CountWords{
static int countWords(String a){
String a1=a.trim();
if(a1.isEmpty()){
return 0;
}
String words[]=a1.split("\\s+");
return words.length;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(countWords(s));
}
}