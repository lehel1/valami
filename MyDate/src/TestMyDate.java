
public class TestMyDate {

	public static void main(String[] args) {
		MyDate date1=new MyDate(9998,1,31);
		
		System.out.println(date1);
		//System.out.println(date.isValidDate(1900, 2, 29));
		System.out.println(date1.nextDay());
		System.out.println(date1.nextMonth());
		System.out.println(date1.nextYear());
	}

}
