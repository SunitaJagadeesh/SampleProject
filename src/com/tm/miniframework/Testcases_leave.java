package com.tm.miniframework;

public class Testcases_leave extends HRMuserLibs {
	
	
     
	public static void applyLeave ()  {
		launchApp();
		loginApp();
		applyingLeave();
		datePicker();
		clickApply();
	}
    public static void viewLeave () {
    	launchApp();
		loginApp();
		mousehoverLeave();
    	myLeave();
    	datePicker();
    	checkbox();
    	pendingStatusCheck();
    	clickSearch();
    	rowCount();
    	colCount();	
	}
}