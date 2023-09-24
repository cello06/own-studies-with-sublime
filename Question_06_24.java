import java.util.*;

public class Question_06_24{
	public static void main(String[] args) {
		System.out.print("Current time and date is : ");
		printTimeAndDate();
	}
	public static void printTimeAndDate(){
		printTime();
		printDate();
	}
	public static void printTime(){
		String amOrPm = "";
		int curretHour = getCurrentHour();
		if(curretHour >= 12){
			curretHour = curretHour % 12;
			amOrPm = "PM";
		}else {
			amOrPm = "AM";
		}

		System.out.printf("%d : %d : %d %s  ",curretHour,getCurrentMinute(),getCurrentSecond(),amOrPm);


	}
	public static int getTotalSecond(){
		return (int)(System.currentTimeMillis() / 1000);
	}
	public static int getCurrentSecond(){
		return getTotalSecond() % 60;
	}
	public static int getTotalMinute(){
		return getTotalSecond() / 60;
	}
	public static int getCurrentMinute(){
		return getTotalMinute() % 60;
	}
	public static int getTotalHour(){
		return getTotalMinute() / 60;
	}
	public static int getCurrentHour(){
		return getTotalHour() % 24;
	}
	public static void printDate(){
		int totalDay = getTotalHour() / 24 ;
		int currentYear = 1970;
		int currentMonth = 1;
		int currentDay = 1;

		while(totalDay >= daysInYear(currentYear)){
			totalDay -= daysInYear(currentYear);
			currentYear++;
		}
		while(totalDay >= daysInMonth(currentMonth,currentYear)){
			totalDay -= daysInMonth(currentMonth,currentYear);
			currentMonth++;
		}
		currentDay += totalDay;

		System.out.printf("%d / %d / %d",currentMonth,currentDay,currentYear);

	}
	public static int daysInYear(int year){
		return isLeapYear(year) ? 366 : 365 ;
	}
	public static int daysInMonth(int month,int currentYear){
		if(month == 1 || month == 3 || month == 5 
			|| month == 7 || month == 8 
			|| month == 10 || month == 12){
			return 31;
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}else{
			return isLeapYear(currentYear) ? 29 : 28;
		}
	}
	public static boolean isLeapYear(int year){
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}

}