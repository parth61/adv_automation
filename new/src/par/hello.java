package par;

public class hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String carName = "Volvo";
				
		int maxSpeed = 120;
		
		int x = 5, y=10, z=15;
		System.out.println("Addition - "+(x+y+z));
		
		int myNum = 9;
		float myFloatNum = 8.99f;
		char myLetter = 'A';
		boolean myBool = false;
		String myText = "Hello World";
		
		double myDouble = 9.81d;
		int myInt = (int) myDouble;
		System.out.println(myInt);
		
		System.out.println(10*5);
		
		System.out.println(10/5);
		
		int a=10;
		++a;
		System.out.println(a);
		
		int b = 5;
		b +=10;
		System.out.println(b);
		
		String greeting = "Hello";
		System.out.println(greeting.length());
		System.out.println(greeting.toUpperCase());
		
		String firstName = "Parth";
		String lastName = "Ramani";
		System.out.println(firstName+" " + lastName);
		System.out.println(firstName.concat(lastName));
		
		String txt = "Hello Everyone";
		System.out.println(txt.indexOf("one"));
		
		int p = 10;
		int q = 15;
		Math.max(p, q);
		//Math.sqrt(p);//
		System.out.println(p);
		
		Math.random();
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		
		int c = 15;
		int d = 15;
		System.out.println(d>c);
		
		if (d==c) 
			System.out.println("Hello World");
		
		else 
		System.out.println("Bye World");
		
		int ab = 30;
		int cd = 20;
		
		if (ab==cd)
			System.out.println(1);
		
		else if (ab>cd)
			System.out.println(2);
		
		else
			System.out.println(3);
		
		int num = 19;
		String result = (num < 20) ? "less than 20" : "more than 20";
		System.out.println(result);
		
		int day = 8;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Move to next week");
		}
		
		/*int i = 0;
		while (i<5) {
			System.out.println(i);
			i++;
		}*/
		
		int r =10;
		do {
			System.out.println(r);
			r++;
		}
		while (r<6);
		
		for (int s=0;s<5;s++) {
			System.out.println("yes");
		}
		
		String [] cars = {"volvo","honda","ford"};
		//for (String car : cars) {
			System.out.println(cars[1]);
		//}
		
}
}