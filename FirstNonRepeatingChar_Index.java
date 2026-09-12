import java.util.Scanner;
class FirstNonRepeatingChar_Index{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int freq[]=new int[256];
for (int i=0;i<s.length();i++){
freq[s.charAt(i)]++;
}
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(freq[ch]==1)
System.out.println(i);
break;}
}
}