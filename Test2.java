class Base
{
 	protected int x;
	public void setX(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return (x);
	}
}

class Derived extends Base
{
	protected int y;
	public void setY(int y)
	{
	this.y = y;
	}
	public int getY()
	{
	return(y);
	}
}

class Derived1 extends Derived
{
	private int result;
	public int calcRes()
	{
		result = x * y;
		return (result);
	}
}

class Test2
{
public static void main(String[] args)
	{
	Derived1 dobj = new Derived1();
	dobj.setX(10);
	dobj.setY(10);
	int res = dobj.getX()*dobj.getX();
	System.out.println(dobj.calcRes());
	}
}