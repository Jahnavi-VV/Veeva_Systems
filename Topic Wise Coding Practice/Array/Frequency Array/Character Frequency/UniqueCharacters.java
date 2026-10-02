import java.util.Scanner;
class UniqueCharacters{
static void find(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(int i=0;i<256;i++){
if(freq[i]==1){
System.out.print((char)i+" ");
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
find(s);
}
}