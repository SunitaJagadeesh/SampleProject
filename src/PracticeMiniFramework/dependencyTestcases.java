package PracticeMiniFramework;

import org.openqa.selenium.By;

public class dependencyTestcases extends dependencyLibs{
	
	public static void addDependency() {
		launchBrowser();
		loginBrowser();
		clickDep();
		addDep();
		checkAdded();
		
	}
    public static void delDependency() {
    	launchBrowser();
		loginBrowser();
		clickDep();
		//addDep();
		delDep();
	}

}
