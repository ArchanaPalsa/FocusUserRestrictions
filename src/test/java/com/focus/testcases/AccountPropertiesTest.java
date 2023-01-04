package com.focus.testcases;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.AccountPropertiesPage;

import com.focus.base.BaseEngine;

public class AccountPropertiesTest extends BaseEngine 
{
	AccountPropertiesPage cmctp;
	
	//SanityBackup in backup folder in project
	
	@Test(priority=1999)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  cmctp=new AccountPropertiesPage(getDriver());
	  Assert.assertEquals(cmctp.checkRestoreCompany(), true);
	}

	@Test(priority=2000)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  cmctp=new AccountPropertiesPage(getDriver());
	  Assert.assertEquals(cmctp.checkLogin(), true);
	}
 
	}
