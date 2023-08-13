package com.functionalinterface;

public class Customer {
	String customername;
	String planType;
	String location;
	int planAmount;
	
	
	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", planType=" + planType + ", location=" + location
				+ ", planAmount=" + planAmount + "]";
	}


	public Customer(String customername, String planType, String location, int planAmount) {
		super();
		this.customername = customername;
		this.planType = planType;
		this.location = location;
		this.planAmount = planAmount;
	}
	
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(int planAmount) {
		this.planAmount = planAmount;
	}

}
