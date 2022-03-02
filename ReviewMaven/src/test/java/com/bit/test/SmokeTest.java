package com.bit.test;

import org.junit.Test;

import Pages.HomePage;
import Pages.WomenPage;

//test method
public class SmokeTest extends BaseTest {
	HomePage hp;
	WomenPage wp;
	@Test
public void test1() {
	hp=new HomePage(dr);
	hp.verifyHomePageLogo();
	wp=hp.clickOnWomenMenuBar();
	
}
	
}
