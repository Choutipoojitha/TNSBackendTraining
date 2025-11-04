package operators;

public class unary {

	public static void main(String[] args) {
		int a=16;
				 // Post increment
		        System.out.println("The post increment value is " + a++); // prints 16, then increments
		        System.out.println("After post increment, d = " + a); // prints 17

		        // Pre increment
		        System.out.println("The pre increment value is " + (++a)); // increments then prints (18)
		        System.out.println("Current value of d = " + a); // 18

		        // Post decrement
		        System.out.println("The post decrement value is " + a--); // prints 18, then decrements
		        System.out.println("After post decrement, d = " + a); // 17

		        // Pre decrement
		        System.out.println("The pre decrement value is " + (--a)); // decrements then prints (16)
		        System.out.println("Current value of d = " + a); // 16
		// TODO Auto-generated method stub

	}

}
