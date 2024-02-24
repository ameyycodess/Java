class Base
{
 	private int x;
	Base(int x)
	{
	this.x=x;
	}
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
	private int y;
	Derived(int x1,int y)
	{
	this.y=y;
	super(x1);
	}
	public void setY(int y)
	{
	this.y = y;
	}
	public int getY()
	{
	return(y);
	}
}

/*class Derived1 extends Derived
{
	private int result;
	public int calcRes()
	{
		result = x * y;
		return (result);
	}
	public void setXY(int x,int y)
	{
	//super.setX(x);
	super.x = x;
	super.y = y;
	//super.setY(y);
	}
}*/

class Test
{
public static void main(String[] args)
	{
	//Derived1 dobj1 = new Derived1();
	Derived dobj = new Derived(10,25);
	
	//dobj1.setXY(10,20);
	//int x1 = dobj.x;
	//dobj.x = 100;

	System.out.println(dobj.getX());
	System.out.println(dobj.getY());
	}
}