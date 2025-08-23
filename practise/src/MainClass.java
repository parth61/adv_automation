
public class MainClass {
 public void getData(int a) {
	System.out.println(a);
}
 public void getData(String a, int b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB cd =  new ClassB();
		System.out.println(cd.i);
		MainClass m = new MainClass();
		m.getData(5);
		m.getData("parth", 6);
		
	}

}
