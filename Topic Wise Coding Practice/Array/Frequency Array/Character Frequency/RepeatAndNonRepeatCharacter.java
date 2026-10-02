import java.util.Scanner;
class RepeatAndNonRepeatCharacter{
static void firstNonRepeating(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(char ch:s.toCharArray()){
if(freq[ch]==1){
System.out.println("First Non-Repeating: "+ch);
return;
}
}
System.out.println("No non-repeating character");
}
static void firstRepeating(String s){
int[]freq=new int[256];
for(char ch:s.toCharArray()){
freq[ch]++;
}
for(char ch:s.toCharArray()){
if(freq[ch]>1){
System.out.println("First Repeating: "+ch);
return;
}
}
System.out.println("No repeating character");
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
firstNonRepeating(s);
firstRepeating(s);
}
}