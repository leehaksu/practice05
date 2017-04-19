package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height; 
	
	public Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.width=width*s;
		this.height=height*s;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

}
