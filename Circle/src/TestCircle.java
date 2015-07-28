
public class TestCircle {

	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("Radius: "+c1.getRadius()+" Area: "+c1.getArea());
		
		Circle c2=new Circle(2.0);
		System.out.println("Radius: "+c2.getRadius()+" Area: "+c2.getArea());
		
		Circle c3=new Circle();
		c3.setRadius(5.0);
		c3.setColor("green");
		System.out.println("Radius:"+c3.getRadius()+" Area: "+c3.getArea()+" Color:"+c3.getColor());
		
		Circle c4=new Circle(4.0);
		System.out.println(c4.toString());
		
		Circle c5=new Circle(1.2);
		System.out.println(c5);
		
	}

}
