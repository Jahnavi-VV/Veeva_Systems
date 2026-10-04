import java.util.Scanner;
class DayOfWeek2{
static String findDay(int d,int m,int y){
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
int d=sc.nextInt();
int m=sc.nextInt();
int y=sc.nextInt();
System.out.println(findDay(d,m,y));
}
}