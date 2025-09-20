package Testpackage;


import org.testng.annotations.Test;

public class Testclass extends Baseclass{
	@Test(priority=1)
	public void test() {
		ob.verifytitle();	
	}
	@Test(priority=2)
	public void finddistrict() {
		ob.district("fgf");
	}
	@Test(priority=3)
	public void viewdetails() {
		ob.viewdetails();
	}
	@Test(priority=4)
	public void logo() {
		ob.presentlogo();
	}
	@Test(priority=5)
	public void quickcontact() {
		ob.details("sneha","9876543210","sneha@gmail.com","hello");

}
}
