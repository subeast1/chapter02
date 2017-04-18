package paint;

public class PaintApp {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		point1.setX( 10 );
		point1.setY( 20 );
		point1.show();
	
		Point point2 = new Point( 100, 50 );
		point2.show();
		point1.show( false );
		
		Point point3 = new ColorPoint( 50, 80, "red" );
		point3.show( true );
		
		draw( new Rect() );
		draw( new Circle() );
		draw( new Triangle() );
	}

	public static void draw( Shape s ) {
		s.draw();
	}
}
