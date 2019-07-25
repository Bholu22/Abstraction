package abstraction;
class Showable{
	interface message{
		void msg();
	}
}
public class NestedInterfaceinclass implements Showable.message
{
	public void msg(){
		System.out.println("Implementation of Nested Interfaces!!!!!!");
	}
	public static void main(String args[]){
		Showable.message shw=new NestedInterfaces();
		shw.msg();
	}
}