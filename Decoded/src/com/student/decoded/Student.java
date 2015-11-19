package com.student.decoded;

public class Student {
	
	public String name;
	public int rollNo;
	public int age;
	
	
	public void studentInfo()
	{
	System.out.println("I AM :" + name);
	System.out.println("my Roll Number is :" + rollNo);
	System.out.println("MY AGE IS :" + age);
	}
	
    public void giveSomeNumber(int a, int b)
    {
      int num;
      for (num =a; num<= b; num++)
      {
    	  System.out.println(num);
      }
    }
}
