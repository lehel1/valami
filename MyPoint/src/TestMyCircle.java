
public class TestMyCircle {

	public static void main(String[] args){
		
		MyPoint p1=new MyPoint(1,1);
		MyCircle c1= new MyCircle(p1,1);
		System.out.println(c1);
		
		MyCircle c2=new MyCircle(2,2,1);
		System.out.println(c2);

	}
}
