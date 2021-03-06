package test.business.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bank.business.domain.CurrentAccount;

public class Deposit {

	private static bank.business.domain.Deposit deposit;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bank.business.domain.ATM atm = new bank.business.domain.ATM(0);
		bank.business.domain.Client client = new bank.business.domain.Client("John", "Woods", 0, "Pass", new Date("2010/01/01"));
		bank.business.domain.Branch branch = new bank.business.domain.Branch(0);
		bank.business.domain.CurrentAccount account = new CurrentAccount(branch, 0, client);
		Deposit.deposit = new bank.business.domain.Deposit(atm, account, 0, 1000.0);
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
	public void amount() {
		assertEquals("Current amount", 1000.0, Deposit.deposit.getAmount(), 0.0);
	}
}
