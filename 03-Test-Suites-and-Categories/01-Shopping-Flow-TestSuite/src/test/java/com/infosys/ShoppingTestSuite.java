package com.infosys;

import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("Shoping Test")
@SelectClasses(
        {
                LoginTest.class,
                PaymentTest.class,
                OrderTest.class
        }
)
//@SelectPackages(com.infosys.testsuited)
//@IncludePackages(com.infosys.testsuited.subpackage)
public class ShoppingTestSuite {
}
