package com.github.shareme.bddandroid.test;

import android.test.suitebuilder.TestSuiteBuilder;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
* A test suite containing all tests for ApiDemos.
*
* To run all suites found in this apk:
* $ adb shell am instrument -w \
*   com.github.sharemebddandroid.tests/android.test.InstrumentationTestRunner
*
* To run just this suite from the command line:
* $ adb shell am instrument -w \
*   -e class com.gihtub.shareme.bddandroid.test.AllTests \
*   com.github.shareme.bddandroid.tests/android.test.InstrumentationTestRunner
*
* To run an individual test case, e.g. {@link com.example.android.apis.os.MorseCodeConverterTest}:
* $ adb shell am instrument -w \
*   -e class com.example.android.apis.os.MorseCodeConverterTest \
*   com.example.android.apis.tests/android.test.InstrumentationTestRunner
*
* To run an individual test, e.g. {@link com.example.android.apis.os.MorseCodeConverterTest#testCharacterS()}:
* $ adb shell am instrument -w \
*   -e class com.example.android.apis.os.MorseCodeConverterTest#testCharacterS \
*   com.example.android.apis.tests/android.test.InstrumentationTestRunner
*/
public class AllTestsSuite extends TestSuite {

    public static Test suite() {
        return new TestSuiteBuilder(AllTestsSuite.class)
                .includeAllPackagesUnderHere()
                .build();
    }
}
