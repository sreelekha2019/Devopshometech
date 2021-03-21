package in.javahome.myweb.controller;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
        public void testMultiply(){
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
	public void testAddNew(){
		Assert.assertEquals(cal.add(10, 20), 30);
	}
}
