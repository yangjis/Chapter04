package com.javaex.ex03;

//구해지는 면적이 같으면 두 객체가 같은 것으로 정의한다.
//equals를 재정의한다.

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(this.width * this.height == r.width * r.height) 
			return true;
		else
			return false;
	}
}
