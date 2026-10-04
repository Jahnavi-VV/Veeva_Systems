import java.util.*;
class CommonPrefix{
static void findCommonPrefix(String[]a1,String[]a2){
ArrayList<String>res=new ArrayList<>();
for(String s1:a1){
for(String s2:a2){
int len=Math.min(s1.length(),s2.length());
int i=0;
while(i<len&&s1.charAt(i)==s2.charAt(i)){
i++;
}
if(i>0){
if(!res.contains(s1)){
res.add(s1);}
if(!res.contains(s2)){
res.add(s2);}
}
}
}
System.out.println(res);
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
findCommonPrefix(a1,a2);
}
}
