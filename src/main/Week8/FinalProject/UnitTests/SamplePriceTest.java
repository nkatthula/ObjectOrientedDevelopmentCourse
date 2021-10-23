package main.Week8.FinalProject.UnitTests;

import static org.junit.Assert.*;

import main.Week8.FinalProject.GreenFarmers;
import org.junit.Test;

public class SamplePriceTest {

	@Test
	public void test() {
		GreenFarmers covid = new GreenFarmers();
		double medi =  covid.displayPrice(100);
		assertEquals(100,medi,1);
	}

}
