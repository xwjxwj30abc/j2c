package zx.soft.j2c.demo;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class HelloWorld {

	public interface CLibrary extends Library {
		CLibrary INSTANCE = (CLibrary) Native.loadLibrary("test", CLibrary.class);

		int add(int a, int b);
	}

	public int add(int a, int b) {
		return CLibrary.INSTANCE.add(a, b);
	}

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		int c = hello.add(20, 20);
		System.out.println(c);
	}

}
