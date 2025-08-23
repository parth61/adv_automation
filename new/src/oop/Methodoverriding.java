package oop;


	class RBI //parent
	{
		public int getROI() 
		{
			return 0;
		}
	}

	class SBI extends RBI //child1
	{
		public int getROI() 
		{
			return 4;
		}
	}
	
	class AXIS extends RBI //child2
	{
		public int getROI() 
		{
			return 5;
		}
	}
	public class Methodoverriding 
	{
	public static void main(String[] args) 
	{
		SBI s= new SBI();
		System.out.println("SBI ROI is - "+s.getROI());
		
		AXIS a= new AXIS();
		System.out.println("AXIS ROI is - "+a.getROI());
		

	}

}
