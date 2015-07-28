
public class MyTime {
	private int hour=0;
	private int minute=0;
	private int second=0;
	
	public MyTime(int hour,int minute, int second){
		setTime(hour,minute,second);
	}
	
	public void setTime(int hour, int minute, int second){
		if(hour>=0&& hour<=23) this.hour=hour; else System.out.println("Invalid hour");
		if(minute>=0&& minute<=60)this.minute=minute;else System.out.println("Invalid minute");
		if(second>=0&& second<=60)this.second=second;else System.out.println("Invalid second");
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public void setHour(int hour){
		this.hour=hour;
	}
	
	public void setMinute(int minute){
		this.minute=minute;
	}
	
	public void setSecond(int second){
		this.second=second;
	}
	
	public String toString(){
		String hour,minute,second;
		if (this.hour<10) {
			hour="0"+this.hour;
		}
		else hour=String.valueOf(this.hour);
		if (this.minute<10) {
			minute="0"+this.minute;
		}
		else minute=String.valueOf(this.minute);
		if (this.second<10) {
			second="0"+this.second;
		}
		else second=String.valueOf(this.second);
		return hour+":"+minute+":"+second;
	}
	
	public MyTime nextSecond(){
		second++;
		
		if (second==60){
			second=0;
			minute++;
		}
		if (minute==60){
			minute=0;
			hour++;
		}
		if (hour==24) hour=0;
		return this;
	}
	
	public MyTime nextMinute(){
		minute++;
		
		if (minute==60){
			minute=0;
			hour++;
		}
		if (hour==24) hour=0;
		return this;
	}
	
	public MyTime nextHour(){
		hour++;
		
		if (hour==24) hour=0;
		return this;
	}
	
	public MyTime previousSecond(){
		second--;
		
		if (second==-1){
			second=59;
			minute--;
		}
		if (minute==-1){
			minute=59;
			hour--;
		}
		if (hour==-1) hour=23;
		return this;
	}
	
	public MyTime previousMinute(){
		minute--;
		
		if (minute==-1){
			minute=59;
			hour--;
		}
		if (hour==-1) hour=23;
		return this;
	}
	
	public MyTime previousHour(){
		hour--;
		
		if (hour==-1) hour=23;
		return this;
	}
}