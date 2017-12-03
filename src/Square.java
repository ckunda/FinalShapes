/**
 * State Diagram
 * 
 * Square() -> s0
 * Square(length) -> s0
 * Square(Square s) -> s0
 *
 * s0: calculateArea() -> s1
 * s1: getParmsString() -> s(terminal)
 *
 */
public class Square extends Shape {

	private float length;

	public Square() { }
	public Square(float l) { length = l; }
	public Square(Square s) { length = s.getLength(); }
	public void setLength(float l) { length = l; }
	public float getLength() { return length; }
	
	@Override
	public void calculateArea() { area = length * length; }

	@Override
	public String getParmsString() {
		return String.format("Length = %s", length);
	}
}
