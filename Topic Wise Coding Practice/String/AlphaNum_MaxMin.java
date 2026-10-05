import java.util.*;
class AlphaNum_MaxMin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int num=0;
boolean hasNum=false;

for(int i=0;i<s.length();i++){
char ch=s.charAt(i);

if(ch>='0'&&ch<='9'){
num=num*10+(ch-'0');
hasNum=true;
}
else{
if(hasNum){
if(num>max){
max=num;
}
if(num<min){
min=num;
}
num=0;
hasNum=false;
}
}
}

if(hasNum){
if(num>max){
max=num;
}
if(num<min){
min=num;
}
}

System.out.println("Minimum = "+min);
System.out.println("Maximum = "+max);
}
}