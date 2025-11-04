package variables;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.speed=180;
		c.type="petrol";
		c.model="swift";
		c.start();
		car c1=new car();
		c1.speed=200;
		c1.type="petrol and cng";
		c1.model="baleno";
		c1.start();
	}

}
