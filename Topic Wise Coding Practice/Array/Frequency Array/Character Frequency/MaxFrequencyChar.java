import java.util.Scanner;
class MaxFrequencyChar{
static char maxFrequency(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
char maxChar=s.charAt(0);
int max=0;
for(char ch:s.toCharArray()){
if(freq[ch]>max){
max=freq[ch];
maxChar=ch;
}
}
return maxChar;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(maxFrequency(s));
}
}