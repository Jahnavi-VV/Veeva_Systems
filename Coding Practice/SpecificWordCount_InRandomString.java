import java.util.*;
class SpecificWordCount_InRandomString{
public static int countWords(String s,String w){
int[] freqS=new int[256];
int[] freqW=new int[256];
for(int i=0;i<s.length();i++){
freqS[s.charAt(i)]++;
}
for(int i=0;i<w.length();i++){
freqW[w.charAt(i)]++;
}
int answer=Integer.MAX_VALUE;
for(int i=0;i<256;i++){
if(freqW[i]>0){
int possible=freqS[i]/freqW[i];
answer=Math.min(answer,possible);
}
}
return answer;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String w=sc.nextLine();
System.out.println(countWords(s,w));
}
}