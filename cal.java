class cal
{
	float div(float a,float b)
	{
		if(b==0)
		{
			return(-1);
		}
		else{
			return(a/b);
		}
	}
	public static void main(String arg[])
	{
		cal c = new cal();
		float x=12,y=6;
		System.out.println("Division is : "+c.div(x,y))
	}
}

