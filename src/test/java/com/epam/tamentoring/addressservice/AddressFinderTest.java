package com.epam.tamentoring.addressservice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple AddressFinder.
 */
public class AddressFinderTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AddressFinderTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AddressFinderTest.class );
    }

    /**
     * test the zip only method
     */
    public void testZipOnlyGetAddressOptions(){
        assertArrayEquals(new String[]{
                "Baross utca",
                "Corvin köz",
                "Futó utca",
                "Harminckettesek tere",
                "Hock János utca",
                "Horváth Mihály tér",
                "Kisfaludy utca",
                "Kisstáció utca",
                "Kistemplom utca",
                "Leonardo da Vinci utca",
                "Nagytemplom utca",
                "Nap utca",
                "Üllői út",
                "Vajdahunyad utca"
        },AddressFinder.getAddressOptions("1082"));
    }


}
