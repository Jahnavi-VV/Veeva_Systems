import java.util.Scanner;
class ReverseString{
static void reverse(String s){
char[]arr=s.toCharArray();
int left=0;
int right=arr.length-1;
while(left<right){
char temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
System.out.println(new String(arr));
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
reverse(s);
}
}