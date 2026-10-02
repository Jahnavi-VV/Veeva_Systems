import java.util.Scanner;
class MostFreqElement{
static int mostFrequent(int[]arr){
int[]freq=new int[100];
for(int x:arr){
freq[x]++;
}
int maxFreq=0;
int answer=-1;
for(int i=0;i<freq.length;i++){
if(freq[i]>maxFreq){
maxFreq=freq[i];
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
System.out.println(mostFrequent(arr));
}
}