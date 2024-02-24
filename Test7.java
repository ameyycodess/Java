class Base
{
	public int calc(int x, int y)
	{
		System.out.println("BAse");
		return (x+y);
	}
}

class Derived extends Base
{
	public int calc(int x,int y)
	{
		System.out.println("Derived");
		return (x-y);
	}
}

class Test6
{
	public static void main(String[] args)
	{
	Derived dobj1 = new Base();
	int res = dobj1.calc(5,20);
	System.out.println(res);

	/*Base bobj = new Derived();
	int res = bobj.calc(10,20);
	System.out.println(res);*/
	}
}