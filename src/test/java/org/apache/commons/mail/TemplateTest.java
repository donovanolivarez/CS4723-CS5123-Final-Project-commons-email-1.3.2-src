package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TemplateTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc() throws EmailException {
		System.out.println("This is a message from the template test.");
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}

	public void testAddMultipleBcc() throws EmailException {
		System.out.println("Test adding multiple BCC addresses using addBcc(String... emails)");
		Email[] dummyEmails = ["a@b.com", "b@c.com", "c@d.com", "d@e.com"];
		testEmail.addBcc(dummyEmails);
		assertEquals(dummyEmails[0], testEmail.getBccAddresses().get(0).toString());
		assertEquals(dummyEmails[1], testEmail.getBccAddresses().get(1).toString());
		assertEquals(dummyEmails[2], testEmail.getBccAddresses().get(2).toString());
		assertEquals(dummyEmails[3], testEmail.getBccAddresses().get(3).toString());
	}

}
