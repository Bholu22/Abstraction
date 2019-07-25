package abstraction;

interface Printable{
	int x=10;
	void print();
}

public class BasicExample implements Printable{
	public void print(){
		System.out.println("I m learning interfaces!!!");
	}
	public static void main(String args[]){
		BasicExample a=new BasicExample();
		a.print();
		System.out.println(x);
	}
}
