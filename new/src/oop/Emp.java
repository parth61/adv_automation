package oop;

import java.util.Scanner;

public class Emp 
{
	private void empinfo() 
	{
		String name = "parth";
		System.out.println("employee name - "+name);
		
	}
	private int grosal(int bsal)
	{
		int da1=1000,da2=2000,gsal;
	
	    if (bsal>=5000 && bsal<=10000)
	    	{
	    	gsal=bsal+da1;
	    	return gsal;
	    	}
	    else if (bsal>10000 && bsal<=20000)
    		{
	    	gsal=bsal+da2;
	    	return gsal;
    		}
	    else
	    {
	    	System.out.println("invalid range");
	    	return 0;
	    }	
	}
	
	protected void getempinfo() 
	{
		empinfo();
	}
	
	protected int getcalsal(int sal) 
	{
		return grosal(sal);
	}
	
}
