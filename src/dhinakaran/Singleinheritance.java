package dhinakaran;

class Parent
{
	int a,b,c,d;
	public void test(int p,int q,int r,int s)
	{
		a=p;b=q;c=r;d=s;
	}
}

class Child extends Parent
{
	int e,f,g,h,k1,k2,k3,k4;
	public void sample (int t,int u,int v, int w)
	{
		e=t;f=u;g=v;h=w;
	}
	public void calculate()
	{
		k1=a+b+c+d+e+f+g+h;
		k2=a-b-c-d-e-f-g-h;
		k3=a*b*c*d*e*f*g*h;
		k4=a/b/c/d/e/f/g/h;
	}
	public void display()
	{
		System.out.println("Addition of a,b,c,d,e,f,g,h is "+k1);
		System.out.println("Subtraction of a,b,c,d,e,f,g,h is "+k2);
		System.out.println("Multiplication of a,b,c,d,e,f,g,h is "+k3);
		System.out.println("Division of a,b,c,d,e,f,g,h is "+k4);
	}
}

public class Singleinheritance 
{
	public static void main(String[] args) 
	{
		Child cc=new Child();
		cc.test(10, 8, 6, 3);
		cc.sample(4, 3, 2, 1);
		cc.calculate();
		cc.display();
}
}
