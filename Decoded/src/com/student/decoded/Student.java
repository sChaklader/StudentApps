package com.student.decoded;

public class Student {
	
	public String name;
	public int rollNo;
	public int age;
	
	
	public void studentInfo()
	{
	System.out.println("I am :" + name);
	System.out.println("My Roll Number is :" + rollNo);
	System.out.println("My Age is :" + age);
	}
	
    public void giveSomeNumber(int a, int b)
    {
      int num;
      for (num =a; num<= b; num++)
      {
    	  System.out.println(num);
      }
    }
    
    public void passFail()
    {
    	int a = 60;
    	if (a < 60)
    	{
    		System.out.println("Student Pass");
    		
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    	
    }
    
    
}
