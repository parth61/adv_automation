package seleniumscript;

public class ContructorDemo {
	int a;
	public ContructorDemo() {
		System.out.println("Constructor Demo");
	}
	
	public ContructorDemo(int a) {
		this.a=a;
		System.out.println(a+10);
	}
	public static void main(String[] args) {
		ContructorDemo c = new ContructorDemo();
		ContructorDemo cc = new ContructorDemo(5);

	}

}
