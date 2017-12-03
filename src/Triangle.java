
public class Triangle implements Shape {

	private float height, base, area;

	public Triangle() { }
	public Triangle(float h, float b) { height = h; base = b; }
	public Triangle(Triangle t) { height = t.getHeight(); base = t.getBase(); }
	public void setHeight(float h) { height = h; }
	public void setBase(float b) { base = b; }
	public float getHeight() { return height; }
	public float getBase() { return base; }

	@Override
	public void calculateArea() { area = height * base / 2.0f; }

	@Override
	public float getArea() { return area; }

	@Override
	public Object getValue() {
		return String.format(" with Height = %s and Base = %s is %s.",
				height, base, area);	}

	@Override
	public String toString() {
		return String.format("Area of Triangle with Height = %s and Base = %s is %s.",
				height, base, area);
	}
}
