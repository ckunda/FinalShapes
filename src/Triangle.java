/**
 * State Diagram
 * 
 * Triangle() -> s0
 * Triangle(height, base) -> s0
 * Triangle(Triangle r) -> s0
 *
 * s0: calculateArea() -> s1
 * s1: getParmsString() -> s(terminal)
 * 
 */
public class Triangle extends Shape {

	private float height, base;

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
	public String getParmsString() {
		return String.format("Height = %s and Base = %s",
				height, base, getArea());
	}
}
