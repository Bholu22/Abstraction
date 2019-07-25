package abstraction;
interface Showable{
	interface message{
		void msg();
	}
}
public class NestedInterfaces implements Showable.message
{
	public void msg(){
		System.out.println("Implementation of Nested Interfaces!!!!!!");
	}
	public static void main(String args[]){
		Showable.message shw=new NestedInterfaces();
		shw.msg();
	}
}
/*we are acessing the Message interface by its outer interface Showable because it cannot be accessed directly.
 It is just like almirah inside the room, we cannot access the almirah directly because we must enter the room first. 
 */
/*The java compiler internally creates public and static interface as displayed below:.
public static interface Showable$Message  
{  
  public abstract void msg();  
} 
*/ 