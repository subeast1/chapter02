package com.jx372.paint.main;

import com.jx372.paint.i.*;
import com.jx372.paint.point.ColorPoint;
import com.jx372.paint.point.Point;
import com.jx372.paint.shape.Circle;
import com.jx372.paint.shape.Rect;
import com.jx372.paint.shape.Shape;
import com.jx372.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		point1.setX( 10 );
		point1.setY( 20 );
		//point1.show();
		draw( point1 );
	
		Point point2 = new Point( 100, 50 );
		//point2.show();
		draw( point2 );
		point1.show( false );
		
		Point point3 = new ColorPoint( 50, 80, "red" );
		//point3.show( true );
		draw( point3 );
		
		draw( new Rect() );
		draw( new Circle() );
		draw( new Triangle() );
		
		resize( point3, 0.5 );
		
		instanceofTest();
	}

//	public static void draw( Shape s ) {
//		s.draw();
//	}

	public static void draw( Drawable drawable ) {
		drawable.draw();
	}
	
	public static void resize( Drawable drawable, double rate ) {
//		if( drawable instanceof Resizable ){
			Resizable resizable = (Resizable) drawable;
			resizable.resize( rate );
//		}
	}
	
	public static void instanceofTest() {

		Shape s = new Circle();

		System.out.println( s instanceof Object );
		System.out.println( s instanceof Circle );
		System.out.println( s instanceof Rect );
		System.out.println( s instanceof Triangle );
		
		Rect r = new Rect();
		// 클래스 경우에는 상속관계만 질의할 수 있다.(에러)
		// System.out.println( r instanceof Circle );
		System.out.println( r instanceof Shape );
		System.out.println( r instanceof Object );
		System.out.println( r instanceof Rect );
		
		//인터 페이스 경우 구현/상속 상관없이 모두다 질의가 가능하다.
		ColorPoint pt = new ColorPoint( 10, 20, "yellow");
		System.out.println( pt instanceof Resizable );
		System.out.println( pt instanceof Drawable );
		System.out.println( pt instanceof Point );
		System.out.println( pt instanceof ColorPoint );
		
	}
}
