package com.kibi.whispa;


public class Contact
{
	private int _id;
	private String _name;
	private String _number;
	
	public Contact(int id, String name, String number)
	{
		_id = id;
		_name = name;
		_number = number;
	}
	public Contact() {}
	
	int getID()
	{
		return _id;
	}
	
	String name()
	{
		return _name;
	}
	
	String number()
	{
		return _number;
	}
	
	public void setID(int new_id)
	{
		_id=new_id;
	}

	public void setName(String new_name)
	{
		_name = new_name;
	}
	
	public void setPhoneNumber(String new_number)
	{
		_number = new_number;
	}
}
