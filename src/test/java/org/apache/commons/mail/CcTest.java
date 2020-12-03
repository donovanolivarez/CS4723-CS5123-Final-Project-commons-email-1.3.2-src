package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class CcTest extends TestCase {
    Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}

    public void testAddCc() throws EmailException {
		System.out.println("Testing addCc method to determine if CC email address is populating the Cc list. - by zwp___");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}
}