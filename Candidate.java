package com.functionalinterface;

import java.util.function.Predicate;

public class Candidate {
	public void CheckAge(Predicate<Integer> p)
	{
		int[] age= {12,23,11,19,35,22};
		for(int i:age) {
			if(p.test(i))
			{
			System.out.println(i+" -> Valid Age");
			}
			else
			{
			System.out.println(i+" -> Invalid Age");
			}
		}
	}
	public static void main(String[] args)
	{
		Candidate obj=new Candidate();
		obj.CheckAge(e->e>18);
	}
}
