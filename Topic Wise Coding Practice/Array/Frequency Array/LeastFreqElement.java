import java.util.Scanner;
class LeastFreqElement{
static int leastFrequent(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
int minFreq=Integer.MAX_VALUE;
int answer=-1;
for(int i=0;i<freq.length;i++){
if(freq[i]>0&&freq[i]<minFreq){
minFreq=freq[i];
answer=i;
}
}
return answer;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(leastFrequent(arr));
}
}