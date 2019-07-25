package abstraction;
interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class MultipleInheritance implements Printable,Showable
{
	public void print(){
		System.out.println("Hello Abhishek!!!!!");
	}
	public void show(){
		System.out.println("Multiple Inheritance in java using interfaces!!!!!");
	}
	public static void main(String args[]){
		Printable p=new MultipleInheritance();
		p.print();
		Showable s=new MultipleInheritance();
		s.show();
		
	}
}
