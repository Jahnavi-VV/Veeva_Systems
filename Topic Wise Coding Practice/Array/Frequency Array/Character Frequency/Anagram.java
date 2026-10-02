import java.util.Scanner;
class Anagram{
static void check(String s1,String s2){
if(s1.length()!=s2.length()){
System.out.println("Not Anagram");
return;
}
int[]freq=new int[256];
for(char ch:s1.toCharArray()){
freq[ch]++;
}
for(char ch:s2.toCharArray()){
freq[ch]--;
}
for(int i=0;i<256;i++){
if(freq[i]!=0){
System.out.println("Not Anagram");
return;
}
}
System.out.println("Anagram");
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
check(s1,s2);
}
}