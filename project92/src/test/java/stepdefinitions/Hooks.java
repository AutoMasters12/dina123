package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before("@smoke")
	public void setup1(){
		System.out.println("precondition1");
	}
	@After("@smoke")
	public void teardown1(){
		System.out.println("postcondition1");
	}
	@Before("@reg")
	public void setup2(){
		System.out.println("precondition2");
	}
	@After("@reg")
	public void teardown2(){
		System.out.println("postcondition2");
	}


}
