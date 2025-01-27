package inheritance;

public class multilevelchild extends multilevelparentB{
public void display2()
{
System.out.println("child c");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevelchild obj=new multilevelchild();
		obj.display();
		obj.display1();
		obj.display2();
		

	}

}
