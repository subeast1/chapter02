package com.jx372.paint.point;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint( int x, int y, String color ) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//완전 재정의
		//super.show();
		
		System.out.println( 
				"점 [x=" + getX() + 
				",y=" + getY() + 
				", color=" + color + 
				"]을 그렸습니다.");
	}
	
	
}
