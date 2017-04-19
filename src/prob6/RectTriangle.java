package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height; 

	
	public RectTriangle(double width, double height)
	{
		this.width=width;
		this.height=height;
	}

	@Override
	double getArea() {
		return (width*height)/2;
		// TODO Auto-generated method stub
	}

	@Override
	double getPerimeter() {
		
		// TODO Auto-generated method stub
		double temp_perimeter= height+width+Math.sqrt(Math.pow(this.height,2)+Math.pow(this.width, 2));
		
		return temp_perimeter;

	}

}
