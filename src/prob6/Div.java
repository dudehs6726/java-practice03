package prob6;

public class Div {
	int a;
	int b;
	
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int calculate()
	{
		if(b == 0)
		{
			return 0;
		}
		else
		{
			return a / b;
		}
	}
}
