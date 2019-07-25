package abstraction;
interface Bank{
	float rateofInterest();
}
class SBI implements Bank{
	public float rateofInterest(){return 9.15f;}
}
class PNB implements Bank{
	public float rateofInterest(){return 12.06f;}
}
public class BankExample{
	public static void main(String args[]){
		Bank s=new SBI();
		System.out.println("ROI of SBI: "+s.rateofInterest());
		Bank p=new PNB();
		System.out.println("ROI of PNB: "+p.rateofInterest());
	}
}