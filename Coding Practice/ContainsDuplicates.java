import java.util.HashSet;
import java.util.Scanner;
class ContainsDuplicates{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
HashSet<Integer>set=new HashSet<>();
boolean found=false;
for(int num:arr){
if(set.contains(num)){
found=true;
break;
}
set.add(num);
}
System.out.println(found);
}
}