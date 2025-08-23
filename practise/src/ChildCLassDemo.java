
public class ChildCLassDemo extends ParentClassdemo{

	public void engine() {
		System.out.println("engine");
	}
	public void color() {
		System.out.println(color);
	}
	
	public void brake() {
		System.out.println("new Brake");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCLassDemo c = new ChildCLassDemo();
		c.color();
		c.brake();


	}

}
