
public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle(int x, int y, int radius){
		this.center =new MyPoint();
		this.center.setXY(x, y);
		
		this.radius=radius;
	}
	
	public MyCircle(MyPoint center, int radius){
		this.center=center;
		this.radius=radius;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius=radius;
	}
	
	public MyPoint getCenter(){
		return center;
	}
	
	public void setCenter(MyPoint center){
		this.center=center;
	}
	
	public int getCenterX(){
		return center.getX();
	}
	
	public int getCenterY(){
		return center.getY();
	}
	
	public void setCenterXY(int x, int y){
		this.center.setX(x);
		this.center.setY(y);
	}
	
	public String toString(){
		return "Circle @ ("+this.center.getX()+","+this.center.getX()+") radius="+this.radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
}