package service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceCollectionTest {

	@Test
	public void testCalcBasicCharge() {

	}

	@Test
	public void testCalcUnitPrice() {
		Service service = new ServiceCollection();
		// どのサービスにも加入していない場合は通話単価は変わらない
				//assertEquals(20, service.calcUnitPrice(new Record("5 2004/06/05 17:50 010 090-1234-0001"), 20));
		// 昼トク割引に加入している場合は通話単価は5円引き
				//service.checkService(new Record("2 E1"));
				//assertEquals(15, service.calcUnitPrice(new Record("5 2004/06/05 17:50 010 090-1234-0001"), 20));
				//service.clear();
		// 家族割引に加入している場合は通話単価は半額で小数点以下切り捨て
				service.checkService(new Record("2 C1 090-1234-0001"));
				assertEquals(7, service.calcUnitPrice(new Record("5 2004/06/05 17:50 010 090-1234-0001"), 15));
				//assertEquals("090-1234-0001", (new Record("5 2004/06/05 17:50 010 090-1234-0001").getCallNumber()));
				//assertTrue(service.isFamilyTelNumber("090-1234-0001"));
				service.clear();
	}

}
