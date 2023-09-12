package Abstraction123;
interface Amazon			
{
void order();
}
class Grocery implements Amazon			
{
public void order()
{
System.out.println("order grocery..");
}
}
class Foothwear implements Amazon			
{
public void order()
{
System.out.println("order foothwear..");
}
}
class Electronics implements  Amazon			
{
public void order()
{
System.out.println("order electronics..");
}
}
class Customer
{
static void buy(Amazon a1)
{
a1.order();
}
}
 class Mainclass2 
 {
	 public static void main(String[]args)
	 {
	 Grocery g1=new Grocery();
	 Foothwear f1=new Foothwear();
	 Electronics e1=new Electronics();
	 Customer.buy(g1);
	 Customer.buy(f1);
	 Customer.buy(e1);
	 }
	 }
