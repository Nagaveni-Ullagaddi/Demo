package Abstraction123;
interface Shoppingmall			
{
void Shopping();
}
class Cloths implements Shoppingmall			
{
public void Shopping()
{
System.out.println("shopping cloths..");
}
}
class Food implements Shoppingmall			
{
public void Shopping()
{
System.out.println("shooping food..");
}
}
class Movie implements Shoppingmall			
{
public void Shopping()
{
System.out.println("shopping movie..");
}
}
class Stimulator
{
static void purchase(Shoppingmall s1)
{
s1.Shopping();
}
}
class Mainclass3 
{
	public static void main(String[]args)
	{
	Cloths c1=new Cloths();
	Food f1=new Food();
	Movie m1=new Movie();
	Stimulator.purchase(c1);
	Stimulator.purchase(f1);
	Stimulator.purchase(m1);
	}
	}