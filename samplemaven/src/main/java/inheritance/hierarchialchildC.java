package inheritance;

public class hierarchialchildC extends hierarchialparent 
{
 public void display2()
{
System.out.println("child B");	
}
	public static void main(String[] args)
	{
		hierarchialchildC obj=new hierarchialchildC();
		// TODO Auto-generated method stub
		obj.display();
		obj.display2();

	}

}
