package edu.jenkins.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsTestDemo {
	JenkinsDemo jd=new JenkinsDemo();
	@Test
	public void addTest()
	{
		Assert.assertEquals(jd.add(4, 5), 9);
	}
	@Test
	public void subTest()
	{
		Assert.assertEquals(jd.sub(5, 3), 2);
	}
	@Test
	public void divTest()
	{
		Assert.assertEquals(jd.div(10, 2), 5);
	}
	@Test
	public void multiTest()
	{
		Assert.assertEquals(jd.multi(4, 2),8);
	}
	
	

}
