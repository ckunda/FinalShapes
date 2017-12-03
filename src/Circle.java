/**
 * State Diagram
 * 
 * Circle() -> s0
 * Circle(radius) -> s0
 * Circle(Circle c) -> s0
 *
 * s0: calculateArea() -> s1
 * s1: getParmsString() -> s(terminal)
 *
 */
public class Circle extends Shape {

	private float radius;

	public Circle() { }
	public Circle(float r) { radius = r; }
	public Circle(Circle c) { radius = c.getRadius(); }
	public void setRadius(float r) { radius = r; }
	public float getRadius() { return radius; }

	@Override
	public void calculateArea()
	{ area = (float) (Math.PI * radius * radius); }

	@Override
	public String getParmsString()
	{ return String.format("Radius = %s", radius); }
}
