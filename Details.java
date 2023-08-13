package com.functionalinterface;

import java.util.ArrayList;

public class Details {
	public static void PrintDetails(Person p)
	{
		System.out.println("Name :"+p.getPersonName()+", Email: "+p.getEmailId());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person("Shravani","Shravani@gmail.com"));
		list.add(new Person("Deepak","Deepak1902@gmail.com"));
		list.forEach(Details::PrintDetails);
	}

}
