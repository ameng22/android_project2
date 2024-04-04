package jlin2.examples.localtesting

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmailAddressFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }
}