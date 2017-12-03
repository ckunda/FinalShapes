
public class Square implements Shape {

	private float length, area;

	public Square() { }
	public Square(float l) { length = l; }
	public Square(Square s) { length = s.getLength(); }
	public void setLength(float l) { length = l; }
	public float getLength() { return length; }
	
	@Override
	public void calculateArea() { area = length * length; }
	
	@Override
	public float getArea() { return area; }

	@Override
	public Object getValue() { return this.toString(); }

	@Override
	public String toString() {
		return String.format("Area of Square with Sides Length = %s is %s.", length, area);
	}
}