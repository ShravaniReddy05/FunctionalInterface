package com.functionalinterface;

import java.util.*;
import java.util.function.BinaryOperator;
import com.functionalinterface.Customer;

public class biCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails cd=new CustomerDetails();
		
		BinaryOperator<Customer> biop=BinaryOperator.maxBy((i,j)->{
			if(i.getPlanAmount() == j.getPlanAmount())
			{
				return 0;
			}
			else if(i.getPlanAmount() > j.getPlanAmount())
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		});
		System.out.println(biop.apply(cd.item.get(0),cd.item.get(1)));
	}
}
