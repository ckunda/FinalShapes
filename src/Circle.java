
public class Circle implements Shape {

	private float radius, area;

	public Circle() { }
	public Circle(float l) { radius = l; }
	public Circle(Circle c) { radius = c.getLength(); }
	public void setLength(float l) { radius = l; }
	public float getLength() { return radius; }
	
	@Override
	public void calculateArea() { area = (float) (Math.PI * radius * radius); }

	@Override
	public float getArea() { calculateArea(); return area; }

	@Override
	public Object getValue() {
		return String.format(" with Radius = %s is %s.", radius, getArea());
	}

	@Override
	public String toString() {
		return String.format("Area of Circle with Radius = %s is %s.", radius, getArea());
	}
}
