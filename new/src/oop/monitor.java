package oop;

public class monitor {
	
	static String brand;
	String type;
	int price, size;
	public void display() 
	{
		System.out.println("Brand- "+brand);
		System.out.println("type- "+type);
		System.out.println("price- "+price);
		System.out.println("size- "+size);
	}

	public void onoff() 
	{
		System.out.println("monitor is getting on");
	}
}
