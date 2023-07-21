
import java.util.*;
class Datetime
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("14 digit number");
		String inputdate=sc.nextInt();
		System.out.println("offset value");
		int offsetdate=sc.nextInt();
		int year=int.parseInt(inputdate.a(0,4));
		int m=int.ParseInt(inputdate.a(5,6));
		int date=int.ParseInt(inputdate.a(7,8));
		int hour=int.parseInt(inputdate.a(9,10);
		int minute=int.parseInt(inputdate.a(11,12);
		int second=int.parseInt(inputdate.a(13,14);
		LocalDatetime dateTime=LocalDatetime.of(year,m,date,hour,minute,second);
		dateTime=dateTime.plusSeconds(offsetSeconds);
		String correct=String.num("%4d%2d%2d%2d%2d%2d",dateTime.getYear(),dateTime.getMonthvalue(),dateTime.getYear(),dateTime.dateofmonth(),dateTime.gethour(),dateTime.getminute(),dateTime.getSecond());
		System.out.println(correct);
	}
}
     	