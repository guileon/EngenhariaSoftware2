package test.business.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ATM {
	
	private static bank.business.domain.ATM atm0;
	private static bank.business.domain.ATM atm1neg;
	private static bank.business.domain.ATM atm1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ATM.atm0 = new bank.business.domain.ATM(0);
		ATM.atm1neg = new bank.business.domain.ATM(-1);
		ATM.atm1 = new bank.business.domain.ATM(1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAtm0Number() {
		assertEquals("ATM 0 number is correct", 0, ATM.atm0.getNumber());
	}

	@Test
	public void testAtm1NegNumber() {
		assertEquals("ATM -1 number is correct", -1, ATM.atm1neg.getNumber());
	}

	@Test
	public void testAtm1Number() {
		assertEquals("ATM 1 number is correct", 1, ATM.atm1.getNumber());
	}

	@Test
	public void testAtm0Hash() {
		assertEquals("ATM 0 hash is correct", 31, ATM.atm0.hashCode());
	}

	@Test
	public void testAtm1NegHash() {
		assertEquals("ATM -1 is correct", 31, ATM.atm1neg.hashCode());
	}

	@Test
	public void testAtm1Hash() {
		assertEquals("ATM 1 is correct", 32, ATM.atm1.hashCode());
	}

	@Test
	public void testAtmEquals() {
		assertTrue("ATM 1 is correct", ATM.atm0.equals(new bank.business.domain.ATM(0)));
	}
}
