package objects;

import java.text.NumberFormat;

public class WaysToCreateAnObject {

	void method() {
		System.out.println("method");
	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

		// 1. using new operator
		WaysToCreateAnObject obj = new WaysToCreateAnObject();

		// 2. using factory methods
		NumberFormat obj2 = NumberFormat.getNumberInstance();

		// using newInstance()
		Class c = Class.forName("WaysToCreateAnObject");

		WaysToCreateAnObject obj3 = (WaysToCreateAnObject) c.newInstance();

		// using cloning

		WaysToCreateAnObject obj4 = (WaysToCreateAnObject) obj.clone();

	}

}
