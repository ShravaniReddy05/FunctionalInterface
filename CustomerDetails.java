package com.functionalinterface;

import java.util.*;

public class CustomerDetails {
	ArrayList<Customer> item=new ArrayList<>();
	public CustomerDetails()
	{
		item.add(new Customer("Erric","Top up","Hyd",181));
		item.add(new Customer("Peter","All in one","Pune",999));
		item.add(new Customer("Kate","XYZ","London",350));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails cd=new CustomerDetails();
		
		cd.item.sort((i,j)->i.getCustomername().compareTo(j.getCustomername()));
		cd.item.forEach(System.out::println);
		
		cd.item.removeIf((i)->i.getPlanAmount()>200);
		cd.item.forEach(System.out::println);
		
		
	}

}
