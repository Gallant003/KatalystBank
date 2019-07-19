package com.service.RestfulWebService;


public class Customer  {
//Class variable, Member variable , properties of the class
	public 	int id;
	private 	double salary;
	private 	String name;


	
 
 
	
	//constructor
	
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getCost1() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}





	Customer(){}
	
	public Customer(int id,double cost,String name){
		
		this.id=id;
		this.cost=cost;
		this.name=name;
	}
	
	
	
	double getCost()
	{
		return cost*.1;
	}
	
	public void  printCustomerDetails()
	{
		String space="  ";
		System.out.println(id+space+ name+space+cost);
		
	}
	
	

}

