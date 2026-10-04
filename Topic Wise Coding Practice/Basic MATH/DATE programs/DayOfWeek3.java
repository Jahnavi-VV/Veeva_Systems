import java.util.Scanner;
class DayOfWeek3{
static String findDay(int arr[]){
int d=arr[0];
int m=arr[1];
int y=arr[2];
if(m<3){
m+=12;
y--;
}
int Y=y%100;
int C=y/100;
int h=(d+(13*(m+1))/5+Y+Y/4+C/4+5*C)%7;
String[] days={
            "Saturday",
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday"
        };

        return days[h];
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int date[]=new int[3];
for(int i=0;i<3;i++){
date[i]=sc.nextInt();
}
System.out.println(findDay(date));
}
}