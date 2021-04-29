package com.te.factoryMethod.Demo;

public class GetPlan {
	public Plan getPlan(String plString) {
		if(plString==null) {
			return null;
		}
		if(plString.equalsIgnoreCase("Domestic")) {
		return new Domestic();
		}
		else if(plString.equalsIgnoreCase("Commerical")) {
			return new Commerical();
			}
		else if(plString.equalsIgnoreCase("Institutional")) {
			return new Institutional();
			}
		return null;
	}

}
