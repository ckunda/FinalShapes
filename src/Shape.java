
public abstract class Shape {

	protected float area;

	public float getArea() { calculateArea(); return area; }
	public String toString() {
		String anyShape = this.getClass().getSimpleName();
		return String.format("Area of %s with %s is %s.",
				anyShape, getParmsString(), getArea());
	}
	public abstract void calculateArea();
	public abstract String getParmsString();
}