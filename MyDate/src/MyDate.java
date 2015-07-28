
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private static String[] strMonths={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static String[] strDays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private static int[] dayInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static boolean isLeapYear(int year){
		boolean leap=false;
		if(year%4==0 ) leap= true;
		if(year%100==0) leap=false;
		if(year%400==0) leap=true;
		return leap;
	}
	
	public static boolean isValidDate(int year, int month, int day){
		boolean valid=true;
		if(year<1||year>9999) valid=false;
		if(month<1||month>12) valid=false;
		if (valid){
			int dayMax=dayInMonth[month-1];
			if (isLeapYear(year)&&month==2) dayMax=29;
			if(day<1||day>dayMax) valid=false;
		}
		return valid;
	}
	
	public static int getDayOfWeek(int year,int month, int day){
		
		return 1;
	}
	
	public MyDate(int year,int month,int day){
		this.setDate(year, month, day);
	}
	
	public void setDate(int year,int month, int day){
		if(isValidDate(year,month,day)){
			this.year=year;
			this.month=month;
			this.day=day;
		}
		else System.out.println("Invalid date");
	}
	
	public void setYear(int year){
		if(year>0&&year<10000) this.year=year;
		else System.out.println("Invalid year");
	}
	
	public void setMonth(int month){
		if(month>0&&month<13) this.month=month;
		else System.out.println("Invalid month");
	}
	
	public void setDay(int day){
		int dayMax=dayInMonth[this.month];
		if(isLeapYear(this.year)&&this.month==2) dayMax=29;
		if (day>0&&day<=dayMax) this.day=day;
		else System.out.println("Invalid day");
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public String toString(){
		return day+" "+strMonths[month-1]+" "+year;
	}
	
	public MyDate nextDay(){
		day++;
		if(day>dayInMonth[month-1]){
			day=1;
			month++;
		}
		if (month>12) {
			month=1;
			year++;
		}
		
		if(year<=9999){
			
			return this;
		}
		else{
			System.out.println("Year out of range");
			return null;
		}
		
	}
	
	public MyDate nextMonth(){

		month++;
		if (month>12) {
			month=1;
			year++;
		}
		if (day>dayInMonth[month-1]) day=dayInMonth[month-1];
		if(year<=9999){
			
			return this;
		}
		else{
			System.out.println("Year out of range");
			return null;
		}
	}
	
	public MyDate nextYear(){
	
		year++;
		if(year<=9999){
			
			return this;
		}
		else{
			System.out.println("Year out of range");
			return null;
		}
	}
}
