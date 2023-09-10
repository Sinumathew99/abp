package test;

import org.testng.annotations.Test;

import pages.ABPLoginPages;

public class ABPLoginTest extends ABPBaseclass {
	@Test
	public void test() throws InterruptedException
	{
		ABPLoginPages ob=new ABPLoginPages(cd);
		ob.log("sinumathew4560@gmail.com","Sinumathew@99");
		Thread.sleep(3000);
	}

}
