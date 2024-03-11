
interface Mathss{
	void op();
}

class Sum implements Mathss{
	public void op(){
		int a,b,c;
		a = 5;
		b = 5;
		c = a + b;
		System.out.println(c);
	}
}

class Diff implements Mathss{
	public void op(){
		int a,b,c;
		a = 5;
		b = 5;
		c = a - b;
		System.out.println(c);
	}
}

public class Prac2c{
	public static void main(String[] args){
		Sum sum = new Sum();
		Diff diff = new Diff();

		sum.op();
		diff.op();
	}
}