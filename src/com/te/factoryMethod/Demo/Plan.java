package com.te.factoryMethod.Demo;
 
public abstract class Plan {
	protected double rate;
	public abstract void getRate();
	
	public void Calculatebill(float units) {
		System.out.println(units*rate);
		
	}
	

}
