
public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAircraft c = new ChildAircraft();
		c.color();
		c.engine();
		c.safety();
		
		

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red color");
	}

}
