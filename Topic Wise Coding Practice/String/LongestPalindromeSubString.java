import java.util.*;
class LongestPalindromeSubString{
static void longPalindrome(String s){
String res="";

for(int i=0;i<s.length();i++){

int l=i;
int r=i;

while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
if(r-l+1>res.length()){
res=s.substring(l,r+1);
}
l--;
r++;
}

l=i;
r=i+1;

while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
if(r-l+1>res.length()){
res=s.substring(l,r+1);
}
l--;
r++;
}
}

System.out.println(res);
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a1=sc.nextLine();
longPalindrome(a1);
}
}