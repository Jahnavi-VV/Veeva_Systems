import java.util.Scanner;
class CharFreqDecoder{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int f[]=new int[256];
for(char q:s.toCharArray()){
f[q]++;
}
for(int i=0;i<f.length;i++){
if(f[i]>0){/* If you want frequency more than certain n value update condition like if(f[i]>n)*/
System.out.println((char)i+""+f[i]);
}}}}