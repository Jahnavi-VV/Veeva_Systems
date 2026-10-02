import java.util.Scanner;
class UniqueCheck{
static void check(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(char ch:s.toCharArray()){
if(freq[ch]>1){
System.out.println("Not Unique");
return;
}
}
System.out.println("All characters are unique");
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
check(s);
}
}