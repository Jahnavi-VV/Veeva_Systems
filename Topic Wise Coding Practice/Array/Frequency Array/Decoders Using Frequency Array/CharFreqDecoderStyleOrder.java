import java.util.Scanner;
class CharFreqDecoderStyleOrder{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int f[]=new int[256];
for(char q:s.toCharArray()){
f[q]++;
}
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(f[ch]>0){  /* If you want frequency more than certain n value update condition like if(f[ch]>n)*/
System.out.println(f[ch]+"["+ch+"]"+f[ch]);
}}}}