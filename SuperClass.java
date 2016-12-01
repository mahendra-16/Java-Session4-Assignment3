package Session4;


public class SuperClass {
	
	int height;
	int base;
	int length;
	int width;

	void Rectangle(int length, int width){
		int areaOfRectangle;
		areaOfRectangle = length * width;
		System.out.println("Area of Rectangle: " + areaOfRectangle);
		
	}
	
	void Triangle(int base, int height){
		int areaOfTriangle;
		areaOfTriangle = (base * height)/2;
		System.out.println("Area of Triangle: " + areaOfTriangle);
		
	}
	
	
}
