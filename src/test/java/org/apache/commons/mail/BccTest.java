package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class BccTest extends TestCase {
    Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}

    public void testAddMultipleBcc() throws EmailException {
		System.out.println("Test adding multiple BCC addresses. This shows that multiple addresses are added to the Bcc list using the addBcc(String...emails) method. - by zwp___");
		String[] dummyEmails = new String[] {"a@b.com", "b@c.com", "c@d.com", "d@e.com"};
		testEmail.addBcc(dummyEmails);
		assertEquals(dummyEmails[0], testEmail.getBccAddresses().get(0).toString());
		assertEquals(dummyEmails[1], testEmail.getBccAddresses().get(1).toString());
		assertEquals(dummyEmails[2], testEmail.getBccAddresses().get(2).toString());
		assertEquals(dummyEmails[3], testEmail.getBccAddresses().get(3).toString());
	}
}