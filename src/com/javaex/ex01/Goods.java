package com.javaex.ex01;

public class Goods {
			
	
	public Goods() {}
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
		String name = "rkd";
		int price;
		
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void showInfo() {
		System.out.println("상품이름: "+name+", 가격: "+price);
	}
	
	
	
	
	
	
	
	
}
