package com.github.shareme.bddandroid.test;

import com.github.shareme.bddandroid.*;
import com.github.shareme.bddandroid.R;
import com.jayway.android.robotium.solo.*;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.util.AttributeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class BDDAndroidActivityTest. We keep a ActivityClassnameTest naming scheme.
 * We are using robotium which is a different setup and we are using the LunarLander sample
 * from the sdk as it has examples of common things you will run into such as UIThread testing, 
 * some classes not visible, inner classes, etc.
 */
public class BDDAndroidActivityTest extends ActivityInstrumentationTestCase2<BDDAndroidActivity>{

	/** The solo. */
	private Solo solo;
	
	
	
	/**
	 * Instantiates a new BDD android activity test.
	 *
	 */
	public BDDAndroidActivityTest() {
		super("com.github.sharemebddandroid", BDDAndroidActivity.class);
		// TODO Auto-generated constructor stub
	}
	@UiThreadTest
	public void testBDDAndroidActivity() {
		solo.assertCurrentActivity(" BDDAndroidActivityis now current activity", BDDAndroidActivity.class);
		//solo.waitForActivity(BDDAndroidActivity.class.getSimpleName(), 5000);
	}
	
	/** 
	 *  We need to have robotium solo getInstrumnetation() before
	 *  we issue anything having to do with activities. Otherwise will get
	 *  errors of unable to resolve Activity class
	 * (non-Javadoc)
	 *   @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	public void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation());
		solo.getCurrentActivity();
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
