package inheritance;

public class hierarchialchild extends hierarchialparent 
{
	public void display1()
	{
		System.out.println("child B");
	}
public static void main(String[] args)
{
		hierarchialchild obj=new hierarchialchild();
		obj.display();
		obj.display1();// TODO Auto-generated method stub

	}

}
