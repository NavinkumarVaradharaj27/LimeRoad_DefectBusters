package com.limeroad_Defect_Busters.pom;

import org.openqa.selenium.WebElement;

public interface LoginPage {
	public static void getAText(WebElement element) {

		System.out.println(element.getText());
	}
}
