class CalculateSquare { 
	public void square() { 
		System.out.println("No Parameter Method Called");
	} 

	public int square( int width, int  height) {
		int area = width * height;
		return area;  
	}
	public double square( double width, double  height) {
		double area =width * height;
		return area;  
	}

	public double square( int width, double  height) {
		double area =width * height;
		return area;  
	}
}
		
public class Polymorphism01 {
	public static void main(String[] args) {
		 CalculateSquare myArea = new CalculateSquare();		
		 System.out.println("����:10, ����:5�� �簢���� ���̴� "+ myArea.square(10,5)); 		 
		 System.out.println("����:2.5, ����:4.5�� �簢���� ���̴� "+myArea.square(2.5, 4.5)); 
		 
	  }
	
}
