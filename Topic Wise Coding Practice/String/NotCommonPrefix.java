import java.util.*;
class NotCommonPrefix{
static void findUnmatched(String[]a1,String[]a2){
ArrayList<String>result1=new ArrayList<>();
ArrayList<String>result2=new ArrayList<>();
for(String s1:a1){
boolean found=false;
for(String s2:a2){
int len=Math.min(s1.length(),s2.length());
int i=0;
while(i<len&&s1.charAt(i)==s2.charAt(i)){
i++;
}
if(i>0){
found=true;
break;
}
}
if(!found){
result1.add(s1);
}
}
for(String s2:a2){
boolean found=false;
for(String s1:a1){
int len=Math.min(s1.length(),s2.length());
int i=0;
while(i<len&&s1.charAt(i)==s2.charAt(i)){
i++;
}
if(i>0){
found=true;
break;
}
}
if(!found){
result2.add(s2);
}
}
System.out.println(result1);
System.out.println(result2);
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
String[]a1=new String[n1];
for(int i=0;i<n1;i++){
a1[i]=sc.next();
}
int n2=sc.nextInt();
String[]a2=new String[n2];
for(int i=0;i<n2;i++){
a2[i]=sc.next();
}
findUnmatched(a1,a2);
}
}