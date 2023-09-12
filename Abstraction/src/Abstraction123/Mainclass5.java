package Abstraction123;
interface Youtube			
{
void watch();
}
class Studies implements Youtube			
{
public void watch()
{
System.out.println("watch studies..");
}
}
class Movies implements Youtube			
{
public void watch()
{
System.out.println("watch movies..");
}
}
class Technology implements Youtube			
{
public void watch()
{
System.out.println("watch technology..");
}
}
class User
{
static void access(Youtube y1)
{
y1.watch();
}
}
class Mainclass5 
{
	public static void main(String[]args)
	{
	Studies s1=new Studies();
	Movies m1=new Movies();
	Technology t1=new Technology();
	User.access(s1);
	User.access(m1);
	User.access(t1);
	}
}
