
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
	public Object getValue() { return this.toString(); }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area of Triangle with Height = ");
		builder.append(height);
		builder.append(" and Base = ");
		builder.append(base);
		builder.append(" is ");
		builder.append(area);
		builder.append(".");
		return builder.toString();
	}
}
