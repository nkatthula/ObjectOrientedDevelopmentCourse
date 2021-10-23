package main.Week8.FinalProject.UnitTests;

import static org.junit.Assert.assertEquals;

import main.Week8.FinalProject.FertilizerBuilder;
import org.junit.Test;

public class SampleBuilderTest {

	@Test
	public void test() {
		FertilizerBuilder med = new FertilizerBuilder();
		double medi =  med.calculateBill(10,5);
		assertEquals(50, medi, 0);
	}

}
