package test.business.domain;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Client {
	
	private static bank.business.domain.Client client;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Client.client = new bank.business.domain.Client("John", "Woods", 0, "pass", new Date("2010/01/01"));
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
	public void validPassword() {
		assertTrue("Client password must match", Client.client.isValidPassword("pass"));
	}

	@Test
	public void invalidPassword() {
		assertFalse("Client password must not match", Client.client.isValidPassword("ssap"));
	}

}
