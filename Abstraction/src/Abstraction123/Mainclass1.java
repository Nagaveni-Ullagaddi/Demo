package Abstraction123;
interface Farmer			
{
void grow();
}
class Ragi implements Farmer			
{
public void grow()
{
System.out.println("growing ragi..");
}
}
class Maize implements Farmer			
{
public void grow()
{
System.out.println("growing maize..");
}
}
class Rice implements Farmer			
{
public void grow()
{
System.out.println("growing rice..");
}
}
class Rain
{
static void rainfall(Farmer f1)
{
f1.grow();
}
}
public class Mainclass1 
{
public static void main(String[]args)
{
Ragi R1=new Ragi();
Maize M1=new Maize();
Rice A1=new Rice();
Rain.rainfall(R1);
Rain.rainfall(M1);
Rain.rainfall(A1);
}
}

