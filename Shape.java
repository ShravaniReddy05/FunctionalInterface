package com.functionalinterface;

public class Shape {

		// TODO Auto-generated method stub
		public void areaCalculator(Area a)
		{
			double ar=a.calculateArea(4);
			System.out.println(ar);
		}
		public static void main(String[] args) {
			Shape obj=new Shape();
			obj.areaCalculator((i)->(i*i));
	}

}
