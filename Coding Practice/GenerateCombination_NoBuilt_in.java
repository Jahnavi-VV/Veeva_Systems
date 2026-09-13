import java.util.*;
class GenerateCombination_NoBuilt_in{
static String[] result;
static int index=0;
public static void generate(int n,int open,int close,String current){
if(current.length()==2*n){
result[index++]=current;
return;
}
if(open<n){
generate(n,open+1,close,current+"(");
}
if(close<open){
generate(n,open,close+1,current+")");
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=1;
for(int i=0;i<n;i++){
count=count*(2*n-i)/(i+1);
}
count=count/(n+1);
result=new String[count];
generate(n,0,0,"");
for(int i=0;i<index;i++){
System.out.println(result[i]);
}
}
}