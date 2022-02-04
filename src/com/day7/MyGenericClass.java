package com.day7;

class Person <X,Y,Z>
{
	private X name;
	private Y id;
	private Z salary;
	
	public Person(X name,Y id, Z salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void printPerson()
	{
		System.out.println("Name "+this.name);
		System.out.println("ID "+this.id);
		System.out.println("Salary "+this.salary);
	}
}

public class MyGenericClass 
{
	public static void main(String args[])
	{
		//Person p=new Person("X",1,2);
		Person<String,Double,Double> p=new Person("X",1,2);
		p.printPerson();
	}

}
