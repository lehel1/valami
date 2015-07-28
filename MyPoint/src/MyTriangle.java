
public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		v1=new MyPoint();
		v1.setXY(x1, y1);
		v2=new MyPoint();
		v2.setXY(x2, y2);
		v3=new MyPoint();
		v3.setXY(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	
	public String toString(){
		return "Triangle @ ("+this.v1.getX()+","+this.v1.getY()+")"+"("+this.v2.getX()+","+this.v2.getY()+")"+"("+this.v3.getX()+","+this.v3.getY()+")";
	}
	
	public double getPreimeter(){
		return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
	}
	
	public void printType(){
		double a=v1.distance(v2);
		double b=v1.distance(v3);
		double c=v3.distance(v2);
		if ((a==b)&&(b==c)) 
		{
			System.out.println("equilateral");
		}
		else if(a==b||a==c||b==c)
		{
			System.out.println("isosceles");
		}
		else 
		{
			System.out.println("scalene");
		}
	}
	
}
