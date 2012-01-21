package com.github.shareme.bddandroid.test;

import com.github.shareme.bddandroid.BDDAndroidActivity;
import com.jayway.android.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;

// TODO: Auto-generated Javadoc
/**
 * The Class BDDAndroidActivityTest. We keep a ActivityClassnameTest naming scheme.
 */
public class BDDAndroidActivityTest extends ActivityInstrumentationTestCase2<BDDAndroidActivity>{

	/** The solo. */
	private Solo solo;
	
	/**
	 * Instantiates a new bDD android activity test.
	 *
	 * @param pkg the pkg
	 * @param BDDAndroidActivity the bDD android activity
	 */
	public BDDAndroidActivityTest(String pkg, Class BDDAndroidActivity) {
		super(pkg, BDDAndroidActivity);
		// TODO Auto-generated constructor stub
	}
	
	public void testBDDAndroidActivity() {
		solo.waitForActivity(BDDAndroidActivity.class.getSimpleName(), 5000);
	}
	
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	@Override
	public void tearDown() throws Exception {
		//Robotium will finish all the activities that have been opened
		solo.finishOpenedActivities();
	}

}
