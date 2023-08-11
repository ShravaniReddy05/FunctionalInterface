//predefined functional interfaces: Consumer and Predicate
package com.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

public class consumerSample {
	
	ArrayList<CallQualityFeedback> item=new ArrayList<>();
	
	consumerSample()
	{
		item.add(new CallQualityFeedback(2,"9025638883","GOOD",4));
		item.add(new CallQualityFeedback(12,"9013526712","AVERAGE",3));
		item.add(new CallQualityFeedback(3,"5236986432","EXCELLENT",5));
		item.add(new CallQualityFeedback(21,"9897747221","BAD",1));
	}
	
	public void evaluateFeedback(Consumer<CallQualityFeedback> c)
	{
		for(CallQualityFeedback i:item)
		{
			c.accept(i);
		}
	}
	public void ratingFeedback(Predicate<CallQualityFeedback> c)
	{
		for(CallQualityFeedback i:item)
		{
			if(c.test(i))
			{
				System.out.println(i+"---Call Quality is Good");
			}
			else
			{
				System.out.println(i+"---Call Quality is Bad");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumerSample obj=new consumerSample();
		obj.evaluateFeedback((e)->System.out.println("Customer ID : "+e.getCustomerId()+",  FeedBack Description : "+e.getFeedBackDescription()));
		obj.ratingFeedback((e)->e.getRating()>3);

	}

}
