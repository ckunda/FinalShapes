
public class Rectangle implements Shape {

	private float length, width, area;

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
	public float getArea() { return area; }

	@Override
	public Object getValue() {
		return String.format(" with Length = %s and Width = %s is %s.",
				length, width, area);
	}
	@Override
	public String toString() {
		return String.format("Area of Rectangle with Length = %s and Width = %s is %s.",
				length, width, area);
	}
}
