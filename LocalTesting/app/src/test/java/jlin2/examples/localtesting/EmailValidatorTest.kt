package jlin2.examples.localtesting

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmailAddressFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))

    }
    @Test
    fun testValidSubdomainFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun testIncorrectDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }
}