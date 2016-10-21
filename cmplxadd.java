class Complex
{
	double r,i;
	public Complex(double realPart,double imaginaryPart)
	{
		  r=realPart;
		  i=imaginaryPart;
	}

	public Complex
	{
		  r=0;
		  i=0;
	}
	
	public display()
	{	
		  system.out.println("\n\t the no is "+r+" i "+i);
	}
		 
}
Complex add(complex a)
{
	 Complex n=new Complex();
	 n.r=this.r+a.r;
	 n.i=this.i+a.i;
	 return n;
}

class Operation
{
	 public static void main(string args[])
	{ 
		Complex c1=new Complex(10,15);
		Complex c2=new Complex(20,30);
		Complex res=new Complex();
		system.out.println("\n\taddition");
		res=c1.add(c1);
		res.display();
		system.out.println("\n\taddition");
		res=c1.add(c2);
		res.display();
	}
	
}
