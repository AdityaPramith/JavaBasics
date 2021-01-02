/* This program demonstrates the use of different operators
 * by calculating the area and perimeter of circle or square */
class OperatorsDemo {
	public static void main(String[] args) {
		float radius=10;
		float pi = 3.14f;
		float circleArea=pi*radius*radius;      //to calculate the area of circle
		float circlePerimeter= 2*pi*radius;     //to calculate the perimeter of circle
		float squareArea=radius*radius;         //to calculate the area of square
		float squarePerimeter=4*radius;       //to calculate the perimeter of square
		System.out.println("Circle Area:"+circleArea);
		System.out.println("Circle Perimeter:"+circlePerimeter);
		System.out.println("Square Area:"+squareArea);
		System.out.println("Square Perimeter"+squarePerimeter);
	}
	
}

