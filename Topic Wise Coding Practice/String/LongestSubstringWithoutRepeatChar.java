import java.util.*;
class LongestSubstringWithoutRepeatChar{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

HashSet<Character>set=new HashSet<>();
int left=0;
int max=0;
String result="";

for(int right=0;right<s.length();right++){

char ch=s.charAt(right);

while(set.contains(ch)){
set.remove(s.charAt(left));
left++;
}

set.add(ch);

if(right-left+1>max){
max=right-left+1;
result=s.substring(left,right+1);
}
}

System.out.println("Longest Substring = "+result);
System.out.println("Length = "+max);
}
}