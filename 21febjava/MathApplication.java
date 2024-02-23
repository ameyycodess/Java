class Mathoperation

{

	static float mul(float x, float y)
	{
		return x*y;
	}

	static float divide (float x, float y)

	{

		return x/y;

	}

}



class MathApplication
{

	public void static main(String args[])

	{

		float a = MathOperation.mul(4.0,5.0);
		float b = MathOperation.divide(a,2.0); 
		System.out.println("b = " + b);

	}
}