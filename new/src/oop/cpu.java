package oop;

public class cpu {

	public static void main(String[] args) {
		monitor.brand="AOC";
		monitor m=new monitor();
		m.type="LED";
		m.price=5000;
		m.size=20;
		m.display();
		m.onoff();
		
		monitor m1=new monitor();
		
		m1.type="LCD";
		m1.price=10000;
		m1.size=22;
		m1.display();
		m1.onoff();
		
		

	}

}
