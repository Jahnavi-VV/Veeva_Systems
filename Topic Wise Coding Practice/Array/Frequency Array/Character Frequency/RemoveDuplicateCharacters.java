import java.util.Scanner;
class RemoveDuplicateCharacters{
static void remove(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(char ch:s.toCharArray()){
if(freq[ch]>0){
System.out.print(ch);
freq[ch]=0;
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
remove(s);
}
}