package prob6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rd = new Rectangle(5, 6);
		RectTriangle rt = new RectTriangle(6, 2);
		
		List <Shape> list = new ArrayList<Shape>();
		list.add(rd);
		list.add(rt);
		
		Iterator <Shape> it =list.iterator();
		
		while (it.hasNext()) {
			Shape s = it.next();
			System.out.println("area : "+ s.getArea());
			System.out.println("Trianlge :"+s.getPerimeter());
			rd.resize(0.5);
			System.out.println("new area : "+ s.getArea());
			System.out.println("new Triangle : " + s.getPerimeter());
		}
		

	}

}
