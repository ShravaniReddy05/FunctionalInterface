package com.functionalinterface;

import java.util.function.Function;
import java.util.ArrayList;

public class RechargeConsumerData {
	ArrayList<Recharge> list=new ArrayList<>();
	RechargeConsumerData()
	{
		list.add(new Recharge(2,599.0f,"14-08-2023"));
		list.add(new Recharge(21,999.0f,"21-09-2023"));
		list.add(new Recharge(1,399.0f,"21-03-2024"));
	}
	public void rechargeData(Function<Recharge,String> f)
	{
		for(Recharge i:list)
		{
			System.out.println(f.apply(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeConsumerData obj=new RechargeConsumerData();
		//obj.rechargeData((e)->e.getValidDate());
		obj.rechargeData((e)->"CustomerID : "+e.getCustomerId()+", AmountPaid : "+e.getAmount());

	}

}
