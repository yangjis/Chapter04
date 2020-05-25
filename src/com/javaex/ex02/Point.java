package com.javaex.ex02;

//equals()를 재정의해서 사용해보자.

public class Point extends Object{
	
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("[점]x:" + this.x + " /y:" + this.y);
	}
	@Override
	public String toString() {
		return "[점]x:" + this.x + " /y:" + this.y;
	}
	@Override
	public boolean equals(Object obj) {
		
		Point p = (Point)obj;
		
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}

}
