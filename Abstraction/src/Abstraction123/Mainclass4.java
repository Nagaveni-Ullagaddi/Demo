package Abstraction123;
interface Hospital		
{
void treat();
}
class Cardiology implements Hospital			
{
public void treat()
{
System.out.println("treat heart patients..");
}
}
class Orthopedic implements Hospital			
{
public void treat()
{
System.out.println("treat bone patients..");
}
}
class Neurology implements Hospital			
{
public void treat()
{
System.out.println("treat mental patients..");
}
}
class Patients
{
static void dieseas(Hospital h1)
{
h1.treat();
}
}
class Mainclass4 
{
	public static void main(String[]args)
	{
	Cardiology c1=new Cardiology();
	Orthopedic o1=new Orthopedic();
	Neurology n1=new Neurology();
	Patients.dieseas(c1);
	Patients.dieseas(o1);
	Patients.dieseas(n1);
	}
}
