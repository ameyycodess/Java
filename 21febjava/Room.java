class Room

{

	float length;

	float breadth;

	Room(float x, float y)

	{

		length = x;
		breadth = y;

	}

	Room(float x)

	{

		length = breadth = x;

	}

	int area( )

	{
	return (length * breadth); 
	}



}