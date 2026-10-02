import java.util.Scanner;
class RearrangeArray{
static void rearrange(int[]arr,int choice){
int index=0;
for(int i=0;i<arr.length;i++){
boolean condition=false;
if(choice==1&&arr[i]<0){
condition=true;
}else if(choice==2&&arr[i]>0){
condition=true;
}else if(choice==3&&arr[i]%2==0){
condition=true;
}else if(choice==4&&arr[i]%2!=0){
condition=true;
}else if(choice==5&&arr[i]==0){
condition=true;
}else if(choice==6&&arr[i]!=0){
condition=true;
}
if(condition){
int temp=arr[i];
arr[i]=arr[index];
arr[index]=temp;
index++;
}
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("1. Move Negatives");
System.out.println("2. Move Positives");
System.out.println("3. Move Even");
System.out.println("4. Move Odd");
System.out.println("5. Move Zeroes");
System.out.println("6. Move Non-Zeroes");
int choice=sc.nextInt();
rearrange(arr,choice);
for(int x:arr){
System.out.print(x+" ");
}
}
}
/*int index=0;

for(int i=0;i<arr.length;i++){

    if(arr[i]<0){

        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;

        index++;
    }
}

IF YOU WANT REVERSE LIKE MOVE THEM BACK OF ANY REQUIRED ELEMENT
int index=arr.length-1;

for(int i=0;i<arr.length;i++){

    if(arr[i]<0){

        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;

        index--;
    }
}*/