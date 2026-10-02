import java.util.Scanner;
class MinFrequencyChar{
static char minFrequency(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
char minChar=s.charAt(0);
int min=Integer.MAX_VALUE;
for(char ch:s.toCharArray()){
if(freq[ch]<min){
min=freq[ch];
minChar=ch;
}
}
return minChar;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(minFrequency(s));
}
}