package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws MyException {
		MyClass m = new MyClass();
		m.dangerousMethod();
	}
}
