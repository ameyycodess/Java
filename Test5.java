class Calc
{
	public int cal(int a,int b)
	{
		return a+b;
	}
	public double cal(double a,double b)
	{
		return a-b;
	}
	/*public int cal(int a,int b)
	{
		return a*b;
	}
	public int cal(int a,int b)
	{
		return a/b;
	}*/

}

class Test5
{
	public static void main(String[] args)
	{
	Calc calobj = new Calc();
	
	int x = calobj.cal(10,10);
	int y = calobj.cal(10,10);
	/*int z = calobj.cal(10,10);
	int v = calobj.cal(10,10);*/

	System.out.println(x);
	System.out.println(x);
	/*System.out.println(x);
	System.out.println(x);*/
	}
}



