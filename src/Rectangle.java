/**
 * State Diagram
 * 
 * Rectangle() -> s0
 * Rectangle(length, width) -> s0
 * Rectangle(Rectangle r) -> s0
 *
 * s0: calculateArea() -> s1
 * s1: getParmsString() -> s(terminal)
 *
 */
public class Rectangle extends Shape {

	private float length, width;

	public Rectangle() {	}
	public Rectangle(float l, float w) { length = l; width = w; }
	public Rectangle(Rectangle r) { length = r.getLength(); width = r.getWidth(); }
	public void setLength(float l) { length = l; }
	public void setWidth(float w) { width = w; }
	public float getLength() { return length; }
	public float getWidth() { return width; }

	@Override
	public void calculateArea() { area = length * width; }
	
	@Override
	public String getParmsString()
	{ return String.format("Length = %s and Width = %s", length, width ); }
}
