package jsp023_servlet;

public class servlet_001 {
	private int a;
	private int b;
	
	public servlet_001() {
		super();
	}

	public servlet_001(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "servlet_001 [a=" + a + ", b=" + b + "]";
	}

}
