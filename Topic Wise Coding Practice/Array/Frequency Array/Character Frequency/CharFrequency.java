import java.util.Scanner;
class CharFrequency{
static void frequency(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(int i=0;i<256;i++){
if(freq[i]>0){
System.out.println((char)i+" = "+freq[i]);
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
frequency(s);
}
}
