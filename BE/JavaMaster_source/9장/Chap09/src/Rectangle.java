public class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle Ŭ���� ������ ȣ��");
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}

	public String toString() {
		return "�簢�� ������ " + super.getColor() + " �׸��� ������ : " + area();
	}
}