
public class IndianTraffic implements CentralTraffic,ContinentTraffic
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c = new IndianTraffic();
		ContinentTraffic cc = new IndianTraffic();
		c.greenGo();
		c.redStop();
		c.flashYellow();
		IndianTraffic i = new IndianTraffic();
		i.walk();
		cc.trainSymbol();

	}
	public void walk() {
		System.out.println("walk");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("train coming");
	}

}
