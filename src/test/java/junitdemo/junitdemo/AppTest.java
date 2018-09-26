package junitdemo.junitdemo;



import org.junit.Assert;
import org.junit.Test;






public class AppTest{
	@Test
	public void testPrintHelloWorld() {

	Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}
	
} 

