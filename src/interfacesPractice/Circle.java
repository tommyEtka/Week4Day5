package interfacesPractice;

public class Circle implements Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
