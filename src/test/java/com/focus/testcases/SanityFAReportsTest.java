/*
package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FocusInventoryReportsPage;
import com.focus.Pages.SanityFAReportsPage;

import com.focus.base.BaseEngine;

public class SanityFAReportsTest extends BaseEngine

{
	SanityFAReportsPage srp;
	
	
	//@Test(priority=25)
	public void checkSalesRegisterReportWithAccountAsSalesComputersCustomizeAndAddStockAccountName() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesRegisterReportWithAccountAsSalesComputersCustomizeAndAddStockAccountName(), true);
	}
	
	//@Test(priority=26)
	public void checkSalesRegisterReportFilterWithStockAccountName() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesRegisterReportFilterWithStockAccountName(), true);
	}
	
	
	
	
	
    @Test(priority=102)
	public void checkFinanacialLedgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinanacialLedgerReport(), true);
	}
	
	@Test(priority=103)
	public void checkLedgerReportWithAllCheckBoxesEnable() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLedgerReportWithAllCheckBoxesEnable(), true);
	}
	
	@Test(priority=104)
	public void checkBacktrackinLedgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinLedgerReport(), true);
	}
	
	
	
	
	
	
	@Test(priority=105)
	public void checkLedgerDetailsreport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLedgerDetailsreport(), true);
	}
	
	@Test(priority=106)
	public void checkLedgerDetailreportWithAllCheckBoxesEnable() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLedgerDetailreportWithAllCheckBoxesEnable(), true);
	}
	
	
	@Test(priority=107)
	public void checkBacktrackinLedgerDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinLedgerDetailReport(), true);
	}
	
	@Test(priority=108)
	public void checkLedgerDetailReportPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLedgerDetailReportPrintOption(), true);
	}
	
	
	
	
	
	
	
	@Test(priority=109)
	public void checkSubledgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSubledgerReport(), true);
	}
	
	@Test(priority=110)
	public void checkCustomizationInSubLedgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationInSubLedgerReport(), true);
	}
	
	@Test(priority=111)
	public void checkBacktrackInSUBLedgerDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackInSUBLedgerDetailReport(), true);
	}
	
	
	
	
	
	@Test(priority=112)
	public void checkCashAndBankReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashAndBankReport(), true);
	}
	
	
	
	
	
	@Test(priority=113)
	public void checkBankBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankBookReport(), true);
	}
	
	@Test(priority=114)
	public void checkBacktrackInBankReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackInBankReport(), true);
	}
	
	@Test(priority=115)
	public void checkPrintOptionInBankReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionInBankReport(), true);
	}
	
	
	
	
	@Test(priority=116)
	public void checkPettyCashBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPettyCashBookReport(), true);
	}
	
	
	
	
	@Test(priority=117)
	public void checkDayBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkDayBookReport(), true);
	}
	
	
	
	
	@Test(priority=118)
	public void checkBankReconciliationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankReconciliationReport(), true);
	}
	
	@Test(priority=119)
	public void checkBankReconciliationImportOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankReconciliationImportOptions(), true);
	}
	
	
	
	
	@Test(priority=120)
	public void checkCustomerVendorReconciliationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerVendorReconciliationReport(), true);
	}
	
	
	
	@Test(priority=121)
	public void checkBankReconciliationStatementReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankReconciliationStatementReport(), true);
	}
	
	@Test(priority=122)
	public void checkBacktrackInBankReconciationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackInBankReconciationReport(), true);
	}
	
	@Test(priority=123)
	public void checkPrintOptionBankReconciliationStatementReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionBankReconciliationStatementReport(), true);
	}
	
	
	
	@Test(priority=124)
	public void checkChequeDiscountingReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkChequeDiscountingReport(), true);
	}
	
	
	
	@Test(priority=125)
	public void checkSalesRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesRegisterReport(), true);
	}
	
	@Test(priority=126)
	public void checkSalesRegisterCustomizationAndReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesRegisterCustomizationAndReport(), true);
	}
	
	@Test(priority=127)
	public void checkBacktrackinSalesRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=128)
	public void checkSalesReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesReturnRegisterReport(), true);
	}
	
	@Test(priority=129)
	public void checkBacktrackinSalesReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesReturnRegisterReport(), true);
	}
	
	@Test(priority=130)
	public void checkPrintOptionSalesReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionSalesReturnRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=131)
	public void checkSummarySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSummarySalesBookReport(), true);
	}
	
	@Test(priority=132)
	public void checkBacktrackInSummarySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackInSummarySalesBookReport(), true);
	}
	
	@Test(priority=133)
	public void checkPrintOptionSummarySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionSummarySalesBookReport(), true);
	}
		
	
	
	
	@Test(priority=134)
	public void checkMonthlySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMonthlySalesBookReport(), true);
	}
	
	
	
	
	@Test(priority=135)
	public void checkTopCustomerListReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTopCustomerListReport(), true);
	}
	
	@Test(priority=136)
	public void checkPrintOptionTopCustomerListReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionTopCustomerListReport(), true);
	}
	
	
	
	
	@Test(priority=137)
	public void checkPurchaseRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchaseRegisterReport(), true);
	}
	
	@Test(priority=138)
	public void checkBacktrackinPurchaserRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinPurchaserRegisterReport(), true);
	}
	
	@Test(priority=139)
	public void checkPrintOptionPurchaseRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionPurchaseRegisterReport(), true);
	}
	
	
	
	
	
	@Test(priority=140)
	public void checkPurchaseReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchaseReturnRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=141)
	public void checkSummaryPurchaseBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSummaryPurchaseBookReport(), true);
	}
	
	@Test(priority=142)
	public void checkBacktrackinSummaryPurchaseBookrReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSummaryPurchaseBookrReport(), true);
	}
	
	@Test(priority=143)
	public void checkPrintOptionSummaryPurchaseBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionSummaryPurchaseBookReport(), true);
	}
	
	
	
	
	
	@Test(priority=144)
	public void checkVatPurchaseAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatPurchaseAccountReport(), true);
	}
	
	@Test(priority=145)
	public void checkCustomizeOptionInVatPurchaseAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizeOptionInVatPurchaseAccountReport(), true);
	}
	
	@Test(priority=146)
	public void checkBacktrackinVATPurchaseAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinVATPurchaseAccountReport(), true);
	}
	
	
	
	
	@Test(priority=147)
	public void checkVatDetailedReportReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatDetailedReportReport(), true);
	}
	
	@Test(priority=148)
	public void checkBacktrackinVatDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinVatDetailReport(), true);
	}
	
	
	
	
	@Test(priority=149)
	public void checkSalesAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesAccountReport(), true);
	}
	
	@Test(priority=150)
	public void checkBacktrackinSalesAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesAccountReport(), true);
	}
	
	
	
	
	@Test(priority=151)
	public void checkSalesByCustomerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesByCustomerReport(), true);
	}

	
	
	
	@Test(priority=152)
	public void checkVatSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatSummaryReport(), true);
	}
	
	
	
	
	
	@Test(priority=153)
	public void checkVatAuditFileReportOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatAuditFileReportOptions(), true);
	}
	
	
	
	@Test(priority=154)
	public void checkVatReturnReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatReturnReport(), true);
	}
	
	
	
	@Test(priority=155)
	public void checkSalesAdvanceVatReportOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesAdvanceVatReportOptions(), true);
	}
	
	@Test(priority=156)
	public void checkBacktrackinSalesSalesAdvanceVAtReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesSalesAdvanceVAtReport(), true);
	}
	
	
	
	
	
	@Test(priority=157)
	public void checkOpeningBalanceRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkOpeningBalanceRegisterReport(), true);
	}
	
	@Test(priority=158)
	public void checkBacktrackinOpeningBalanceRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinOpeningBalanceRegisterReport(), true);
	}
	
	
	
	
	
	@Test(priority=159)
	public void checkJournalEntriesRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkJournalEntriesRegisterOptions(), true);
	}
	
	@Test(priority=160)
	public void checkBacktrackinJournalEntriesRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinJournalEntriesRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=161)
	public void checkCreditNoteRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCreditNoteRegisterOptions(), true);
	}
	
	@Test(priority=162)
	public void checkBacktrackinCreditNoteRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinCreditNoteRegisterReport(), true);
	}
	
	
	
	
	
	
	@Test(priority=163)
	public void checkDebitNoteRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkDebitNoteRegisterReport(), true);
	}
	
	@Test(priority=164)
	public void checkBacktrackinDebitNoteRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinDebitNoteRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=165)
	public void checkReceiptRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkReceiptRegisterReport(), true);
	}
	
	@Test(priority=166)
	public void checkBacktrackinReceiptRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinReceiptRegisterReport(), true);
	}
	
	
	
	
	@Test(priority=167)
	public void checkPaymentRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPaymentRegisterOptions(), true);
	}
	
	@Test(priority=168)
	public void checkBacktrackinPaymentRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinPaymentRegisterReport(), true);
	}
	
	
	
	
	
	@Test(priority=169)
	public void checkPdcReceiptsRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPdcReceiptsRegisterReport(), true);
	}
	
	@Test(priority=170)
	public void checkBacktrackinPdcReceiptsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinPdcReceiptsReport(), true);
	}

	
	
	
	
	@Test(priority=171)
	public void checkPdcPaymentsRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPdcPaymentsRegisterReport(), true);
	}
	
	@Test(priority=172)
	public void checkBacktrackinPdcPaymentsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinPdcPaymentsReport(), true);
	}
	
	
	
	
	@Test(priority=173)
	public void checkEntryJournalRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkEntryJournalRegisterReport(), true);
	}
	
	@Test(priority=174)
	public void checkBacktrackinEntryJournalReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinEntryJournalReport(), true);
	}
	
	
	
	
	@Test(priority=175)
	public void checkEntryJournalDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkEntryJournalDetailReport(), true);
	}
	
	@Test(priority=176)
	public void checkBacktrackinEntryJournalDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinEntryJournalDetailReport(), true);
	}
	
	
	
	
	@Test(priority=177)
	public void checksalesGroupedByCustomerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checksalesGroupedByCustomerReport(), true);
	}
	
	@Test(priority=178)
	public void checkBacktrackinSalesGroupedByCustomerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesGroupedByCustomerReport(), true);
	}
	
	
	
	
	
	@Test(priority=179)
	public void checkSalesGroupedByProductReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesGroupedByProductReport(), true);
	}
	
	
	
	@Test(priority=181)
	public void checkSalesGroupedByDepartmentReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesGroupedByDepartmentReport(), true);
	}
	
	
	
	
	@Test(priority=183)
	public void checkPurchasesGroupedByVendorOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByVendorOptions(), true);
	}
	
	@Test(priority=184)
	public void checkBacktrackinSalesGroupedByVendorReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinSalesGroupedByVendorReport(), true);
	}
	
	
	
	@Test(priority=185)
	public void checkPurchasesGroupedByProductReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByProductReport(), true);
	}
	
	
	
	
	
	@Test(priority=187)
	public void checkPurchasesGroupedByDepartmentReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByDepartmentReport(), true);
	}
	
	@Test(priority=189)
	public void checkCustomisationOptionINPurchasesGroupedByDepartmentReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomisationOptionINPurchasesGroupedByDepartmentReport(), true);
	}
	
	
	
	
	
	@Test(priority=191)
	public void checkMiscellaneousAnalysispeakAndLowBalancesReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMiscellaneousAnalysispeakAndLowBalancesReport(), true);
	}
	
	@Test(priority=192)
	public void checkBacktrackinPeakAndLowBalanceReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinPeakAndLowBalanceReport(), true);
	}
	
	
	
	
	
	
	@Test(priority=193)
	public void checkComprativeAnalysisOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkComprativeAnalysisOptions(), true);
	}
	
	@Test(priority=194)
	public void checkBackTrackInComparativeAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInComparativeAnalysis(), true);
	}
	
	@Test(priority=196)
	public void checkTransactionsTypeAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTransactionsTypeAnalysisReport(), true);
	}
	
	@Test(priority=197)
	public void checkBackTrackInTransactionsTypeAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInTransactionsTypeAnalysis(), true);
	}
	
	@Test(priority=198)
	public void checkAbcAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAbcAnalysisReport(), true);
	}
	
	@Test(priority=199)
	public void checkSortingOptionInAbcAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSortingOptionInAbcAnalysisReport(), true);
	}
	
	@Test(priority=200)
	public void checkBacktrackinABCAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinABCAnalysisReport(), true);
	}
	
	@Test(priority=202)
	public void checkInterestCalculationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkInterestCalculationReport(), true);
	}
	
	@Test(priority=203)
	public void checkBacktrackinInterestCalculationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBacktrackinInterestCalculationReport(), true);
	}
	
	@Test(priority=204)
	public void checkMastersInformationMenuReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMastersInformationMenuReport(), true);
	}

	
	
	@Test(priority=205)
	public void checkProductLabelReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProductLabelReport(), true);
	}
	
	@Test(priority=206)
	public void checkUnitConversionReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkUnitConversionReport(), true);
	}
	
	@Test(priority=207)
	public void checkSkidDefinitionReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSkidDefinitionReport(), true);
	}
	
	@Test(priority=208)
	public void checkAuditTrailTransactionsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAuditTrailTransactionsReport(), true);
	}
	
	@Test(priority=209)
	public void checkAuditTrailLoginsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAuditTrailLoginsReport(), true);
	}
	
	@Test(priority=210)
	public void checkAccountQueryOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAccountQueryOptions(), true);
	}
	
	@Test(priority=211)
	public void checkTransactionAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTransactionAuthorizationReport(), true);
	}
	
	@Test(priority=212)
	public void checkMasterAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMasterAuthorizationReport(), true);
	}
	
	@Test(priority=213)
	public void checkTrailBalanceReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceReport(), true);
	}
	
	@Test(priority=214)
	public void checkTrailBalanceReportPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceReportPrintOption(), true);
	}
	
	@Test(priority=215)
	public void checkBackTrackInTrailBalance() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInTrailBalance(), true);
	}
	
	@Test(priority=216)
	public void checkProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitAndLossReport(), true);
	}
	
	@Test(priority=217)
	public void checkProfitAndLossPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitAndLossPrintOption(), true);
	}

	@Test(priority=218)
	public void checkBackTrackInProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInProfitAndLossReport(), true);
	}
	
	
	
	
	
	@Test(priority=219)
	public void checkTradingAccountOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTradingAccountOptions(), true);
	}
	
	@Test(priority=220)
	public void checkBackTrackInTradingAccount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInTradingAccount(), true);
	}
	
	
	
	
	
	@Test(priority=221)
	public void checkTradingAndProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTradingAndProfitAndLossReport(), true);
	}
	
	@Test(priority=222)
	public void checkPrintOptionInTradingAndProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPrintOptionInTradingAndProfitAndLossReport(), true);
	}
	
	@Test(priority=223)
	public void checkBackTrackInTradingAndProfitAndLoss() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInTradingAndProfitAndLoss(), true);
	}
	
	
	
	
	
	@Test(priority=224)
	public void checkBalanceSheetOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBalanceSheetOptions(), true);
	}
	
	@Test(priority=225)
	public void checkCustomizationAndPrintOptionInBalanceSheetReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInBalanceSheetReport(), true);
	}
	
	@Test(priority=226)
	public void checkBackTrackInBalanceSheet() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInBalanceSheet(), true);
	}
	
	
	
	
	
	@Test(priority=227)//Expected 
	public void checkFinalAccountsSchedulesReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinalAccountsSchedulesReport(), true);
	}
	
	@Test(priority=228)
	public void checkCustomizationAndPrintOptionInFinalAccSchedule() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInFinalAccSchedule(), true);
	}
	
	@Test(priority=229)
	public void checkBackTrackInSchedules() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInSchedules(), true);
	}
	
	
	
	
	
	@Test(priority=230)
	public void checkFundFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFundFlowReport(), true);
	}
	
	@Test(priority=231)
	public void checkCustomizationAndPrintOptionInunfFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInunfFlowReport(), true);
	}
	
	@Test(priority=232)
	public void checkBackTrackInFundFlow() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInFundFlow(), true);
	}
	
	
	
	

	@Test(priority=233)
	public void checkCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashFlowReport(), true);
	}
	
	@Test(priority=234)
	public void checkCustomizationAndPrintOptionInCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInCashFlowReport(), true);
	}
	
	
	
	
	
    @Test(priority=235)
	public void checkCashFLowAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashFLowAnalysisReport(), true);
	}
	@Test(priority=236)
	public void checkCustomizationAndPrintOptionInCashFlowAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInCashFlowAnalysis(), true);
	}
	
	@Test(priority=238)
	public void checkBackTrackInCashFlowAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInCashFlowAnalysis(), true);
	}
	
	
	
	
	
	@Test(priority=240)
	public void checkAdvanceCashFLowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAdvanceCashFLowReport(), true);
	}
	
	
	
	
	
	//@Test(priority=242)//not there
	public void checkBudgetPlanningReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBudgetPlanningReport(), true);
	}
	
	
	
	
	
	@Test(priority=243)
	public void checkIncomeExpenseTrendReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkIncomeExpenseTrendReport(), true);
	}
	
	
	
	
	
	@Test(priority=245)
	public void checkReceavibleAndPayableReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkReceavibleAndPayableReport(), true);
	}
	
	@Test(priority=246)
	public void checkCustomizationAndPrintOptionInRecevibleAndPayableReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomizationAndPrintOptionInRecevibleAndPayableReport(), true);
	}
	
	@Test(priority=247)
	public void checkBackTrackInReceavibleAndPayable() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBackTrackInReceavibleAndPayable(), true);
	}
	
	
	
	
	
	// Receivable and Payable Analysis Reports Starts from Here
	
	@Test(priority=250)
	public void checkCustomerListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerListingOfOutstandingBillsReport(), true);
	}
	
	@Test(priority=251)
	public void CheckFilterAndPrintOptionnInCustomerListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerListingOfOutstandingBillsReport(), true);
	}
	
	@Test(priority=252)
	public void CheckCustomerListingOfOutstandingBillsReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckCustomerListingOfOutstandingBillsReportBackTrackOption(), true);
	}
	
	
	
	
	
	
	@Test(priority=253)
	public void checkCustomerStatementReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerStatementReport(), true);
	}
	
	@Test(priority=254)
	public void CheckFilterAndPrintOptionnInCustomerStatements() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerStatements(), true);
	}
	
	@Test(priority=255)
	public void checkCustomerStatementReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerStatementReportBackTrackOption(), true);
	}
	
	
	
	
	
	@Test(priority=256)
	public void checkCustomerDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerDueDateAnalysisReport(), true);
	}
	
	@Test(priority=257)
	public void CheckFilterAndPrintOptionnInCustomerDueDateAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerDueDateAnalysis(), true);
	}
	
	@Test(priority=258)
	public void checkCustomerDueDateAnalysisBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerDueDateAnalysisBackTrackOption(), true);
	}
	
	
	
	
	
	@Test(priority=259)
	public void checkCustomerAgeingDetailsAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerAgeingDetailsAnalysisReport(), true);
	}
	
	@Test(priority=260)
	public void CheckFilterAndPrintOptionnInCustomerAgeingDetailsAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerAgeingDetailsAnalysis(), true);
	}
	
	@Test(priority=261)
	public void CheckCustomerAgeingDetailsAnalysisBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckCustomerAgeingDetailsAnalysisBackTrackOption(), true);
	}
	
	
	
	
	
	@Test(priority=262)
	public void checkCustomerAgeingDetailsByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerAgeingDetailsByDueDateReport(), true);
	}
	
	@Test(priority=263)
	public void CheckFilterAndPrintOptionnInCustomerAgeingDetailsDueDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerAgeingDetailsDueDate(), true);
	}
	
	@Test(priority=264)
	public void CheckCustomerAgeingDetailsDueDateBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckCustomerAgeingDetailsDueDateBackTrackOption(), true);
	}


	
	
	
	@Test(priority=265)
	public void checkCustomerOverDueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerOverDueAnalysisReport(), true);
	}
	
	@Test(priority=266)
	public void CheckFilterAndPrintOptionnInCustomerOverDueAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckFilterAndPrintOptionnInCustomerOverDueAnalysis(), true);
	}
	
	@Test(priority=267)
	public void CheckCustomerOverDueAnalysisBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckCustomerOverDueAnalysisBackTrackOption(), true);
	}
		
	
	
	
	
	@Test(priority=268)
	public void checkcustomerSummaryCustomerAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerAgeingSummaryReport(), true);
	}
	
	@Test(priority=269)
	public void CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerAgeingSummaryReport(), true);
	}
	
	@Test(priority=270)
	public void checkCustomerSummaryCustomerAgeingSummaryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerSummaryCustomerAgeingSummaryReportBackTrackOption(), true);
	}
	
	
	
	
	
	@Test(priority=271)
	public void checkcustomerSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryAgeingByDueDateReport(), true);
	}
	
	@Test(priority=272)
	public void CheckPrintAndCustomiseOptionnIncustomerSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnIncustomerSummaryAgeingByDueDateReport(), true);
	}
	
	
	@Test(priority=273)
	public void checkCustomerSummaryAgeingByDueDateReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerSummaryAgeingByDueDateReportBackTrackOption(), true);
	}
	
	
	
	
		
	@Test(priority=276)
	public void checkcustomerSummaryCustomerOverDueSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerOverDueSummeryReport(), true);
	}
	
	@Test(priority=277)
	public void CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerOverDueSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerOverDueSummeryReport(), true);
	}
	
	@Test(priority=278)
	public void checkCustomerSummaryCustomerOverDueSummeryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerSummaryCustomerOverDueSummeryReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=279)
	public void checkcustomerSummaryCustomerBillWiseSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerBillWiseSummeryReport(), true);
	}
	
	@Test(priority=280)
	public void CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerBillWiseSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerBillWiseSummeryReport(), true);
	}
	
	@Test(priority=281)
	public void checkCustomerSummaryCustomerBillWiseSummeryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerSummaryCustomerBillWiseSummeryReportBackTrackOption(), true);
	}
	
	
	
	
	
	
	//Vendor Details 
	
	@Test(priority=285)
	public void checkVendorListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorListingOfOutstandingBillsReport(), true);
	}
	
	@Test(priority=286)
	public void CheckPrintAndCustomiseOptionnInVendorListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorListingOfOutstandingBillsReport(), true);
	}
	
	@Test(priority=287)
	public void checkFilterOptionInVendorListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFilterOptionInVendorListingOfOutstandingBillsReport(), true);
	}
	
	@Test(priority=288)
	public void checkVendorListingOfOutstandingBillsReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorListingOfOutstandingBillsReportBackTrackOption(), true);
	}
	
	
	
	
	
	
	@Test(priority=290)
	public void checkvendorDetailsVendorStatementsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkvendorDetailsVendorStatementsReport(), true);
	}

	@Test(priority=291)
	public void CheckPrintAndCustomiseOptionnInvendorDetailsVendorStatementsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInvendorDetailsVendorStatementsReport(), true);
	}
	
	@Test(priority=292)
	public void checkVendorDetailsVendorStatementsReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorStatementsReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=293)
	public void checkvendorDetailsVendorDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkvendorDetailsVendorDueDateAnalysisReport(), true);
	}
	
	@Test(priority=294)
	public void CheckPrintAndCustomiseOptionnInvendorDetailsVendorDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInvendorDetailsVendorDueDateAnalysisReport(), true);
	}
	
	@Test(priority=295)
	public void checkVendorDetailsVendorDueDateAnalysisReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorDueDateAnalysisReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=296)
	public void checkVendorDetailsVendorAgeingDetailsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorAgeingDetailsReport(), true);
	}
	
	@Test(priority=297)
	public void CheckPrintAndCustomiseOptionnInVendorDetailsVendorAgeingDetailsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorDetailsVendorAgeingDetailsReport(), true);
	}
	
	@Test(priority=298)
	public void checkVendorDetailsVendorAgeingReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorAgeingReportBackTrackOption(), true);
	}
	
	
	
	@Test(priority=300)
	public void checkVendorDetailsVendorDetailsAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorDetailsAgeingByDueDateReport(), true);
	}
	
	@Test(priority=301)
	public void CheckPrintAndCustomiseOptionnInvendorDetailsVendorDetailsAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInvendorDetailsVendorDetailsAgeingByDueDateReport(), true);
	}
	
	@Test(priority=302)
	public void checkVendorDetailsAgeingByDueDateReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsAgeingByDueDateReportBackTrackOption(), true);
	}
	
	
	

	
	@Test(priority=303)
	public void checkVendorDetailsVendorOverdueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorOverdueAnalysisReport(), true);
	}
	
	
	@Test(priority=304)
	public void CheckPrintAndCustomiseOptionnInVendorDetailsVendorOverdueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorDetailsVendorOverdueAnalysisReport(), true);
	}
	
	
	@Test(priority=305)
	public void checkVendorOverdueAnalysisReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorOverdueAnalysisReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=306)
	public void checkVendorSummeryVendorAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorAgeingSummaryReport(), true);
	}
	
	@Test(priority=307)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorAgeingSummaryReport(), true);
	}
	
	@Test(priority=308)
	public void checkSummeryVendorAgeingSummaryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSummeryVendorAgeingSummaryReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=309)
	public void checkVendorSummeryVendorSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorSummaryAgeingByDueDateReport(), true);
	}
	
	@Test(priority=310)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorSummaryAgeingByDueDateReport(), true);
	}
	
	@Test(priority=311)
	public void checkVendorSummeryVendorSummaryAgeingByDueDateReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorSummaryAgeingByDueDateReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=312)
	public void checkVendorSummeryVendorOverdueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorOverdueSummaryReport(), true);
	}
	
	@Test(priority=313)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorOverdueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorOverdueSummaryReport(), true);
	}
	
	@Test(priority=313)
	public void checkVendorVendorSummeryVendorOverdueSummaryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorVendorSummeryVendorOverdueSummaryReportBackTrackOption(), true);
	}
	
	
	
	
	@Test(priority=314)
	public void checkVendorSummeryVendorBillWiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorBillWiseSummaryReport(), true);
	}
	
	@Test(priority=315)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorBillwiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorBillwiseSummaryReport(), true);
	}
	

	@Test(priority=316)
	public void checkVendorSummeryVendorBillwiseSummaryReportBackTrackOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorBillwiseSummaryReportBackTrackOption(), true);
	}
	
	
	///////////////////////////////////////////////////
	
	
	@Test(priority=317)
	public void checkCustomerAgeingDetailsAnalysisReportwithMonthlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerAgeingDetailsAnalysisReportwithMonthlyAgeingChkBox(), true);
	}
	
	@Test(priority=318)
	public void checkcustomerSummaryCustomerAgeingSummaryReportwithMontlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerAgeingSummaryReportwithMontlyAgeingChkBox(), true);
	}
	
	
	
	@Test(priority=319)
	public void checkVendorAgeingDetailsAnalysisReportwithMonthlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorAgeingDetailsAnalysisReportwithMonthlyAgeingChkBox(), true);
	}
	
	
	
	
	@Test(priority=320)
	public void checkVendorSummeryVendorAgeingSummaryReportwithMonthlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorAgeingSummaryReportwithMonthlyAgeingChkBox(), true);
	}
	
	
	
	
	
	//////////////////////////////////////////Final Accounts analyze Report///////////////////////////////////////////////////
	
	//Trail Balance
	
	@Test(priority=321)
	public void checkTrailBalanceReportwithFilterOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceReportwithFilterOption(), true);
	}
	
	
	
	@Test(priority=322)
	public void checkTrailBalanceExportPDFOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceExportPDFOption(), true);
	}
	
	@Test(priority=323)
	public void checkTrailBalanceExportExcelSheetOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceExportExcelSheetOption(), true);
	}
	
	
	@Test(priority=324)
	public void checkTrailBalanceAnalyzeOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeOption(), true);
	}
	
	
	@Test(priority=325)
	public void checkTrailBalanceAnalyzeReportExportExcelOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportExportExcelOption(), true);
	}
	
	
	
	@Test(priority=325)
	public void checkValidatingExportedExcelReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkValidatingExportedExcelReport(), true);
	}
	
	
	@Test(priority=326)
	public void checkTrailBalanceAnalyzeReportExportPDFOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportExportPDFOption(), true);
	}
	
	
	//@Test(priority=327)
	public void checkTrailBalanceAnalyzeReportExportCSVOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportExportCSVOption(), true);
	}
	
	@Test(priority=328)
	public void checkTrailBalanceAnalyzeReportPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportPrintOption(), true);
	}
	
	
	
	@Test(priority=329)
	public void checkTrailBalanceAnalyzeReportSaveOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportSaveOption(), true);
	}
	
	 @Test(priority=330)
		public void checkTrailBalanceAnalyzeOptionwithoutFilter() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeOptionwithoutFilter(), true);
		}
	
	
	
	//Trail Balance at User Level
	
	 @Test(priority=331)
	 public void checkLoginWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 srp=new SanityFAReportsPage(getDriver());
		 Assert.assertEquals(srp.checkLoginWithUserAllOptionsST(), true);
	 }
	 
	 @Test(priority=332)
	 public void checkTrailBalanceReportwithFilterOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 srp=new SanityFAReportsPage(getDriver());
		 Assert.assertEquals(srp.checkTrailBalanceReportwithFilterOptionWithUserAllOptionsST(), true);
	 }
	 
	 @Test(priority=333)
		public void checkTrailBalanceAnalyzeOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeOptionWithUserAllOptionsST(), true);
		}
		
		
		@Test(priority=334)
		public void checkTrailBalanceAnalyzeReportExportExcelOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportExportExcelOptionWithUserAllOptionsST(), true);
		}
		
		
		@Test(priority=335)
		public void checkTrailBalanceAnalyzeReportExportPDFOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportExportPDFOptionWithUserAllOptionsST(), true);
		}
		
		
		@Test(priority=336)
		public void checkTrailBalanceAnalyzeReportPrintOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportPrintOptionWithUserAllOptionsST(), true);
		}
		
		
		
		@Test(priority=337)
		public void checkTrailBalanceAnalyzeReportSaveOptionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkTrailBalanceAnalyzeReportSaveOptionWithUserAllOptionsST(), true);
		}
		
		@Test(priority=338)
		public void checkSavedReportatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkSavedReportatUserAllOptionsST(), true);
		}
	 
	 
	
	 @Test(priority=339)
	 public void checkLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 srp=new SanityFAReportsPage(getDriver());
		 Assert.assertEquals(srp.checkLoginWithSU(), true);
	 }
	
	///Profit and Loss
	
	@Test(priority=340)
	public void checkProfitAndLossReportwithFilterOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitAndLossReportwithFilterOption(), true);
	}
	
	
	
	
	@Test(priority=341)
	public void checkProfitLossAnalyzeOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeOption(), true);
	}
	
	
	@Test(priority=342)
	public void checkProfitLossAnalyzeReportExportExcelOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeReportExportExcelOption(), true);
	}
	
	
	@Test(priority=343)
	public void checkProfitLossAnalyzeReportExportPDFOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeReportExportPDFOption(), true);
	}
	
	
//	@Test(priority=344)
	public void checkProfitLossAnalyzeReportExportCSVOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeReportExportCSVOption(), true);
	}
	
	@Test(priority=345)
	public void checkProfitLossAnalyzeReportPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeReportPrintOption(), true);
	}
	
	
	@Test(priority=346)
	public void checkProfitLossAnalyzeReportSaveOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossAnalyzeReportSaveOption(), true);
	}
	
	@Test(priority=347)
	public void checkProfitLossReportwithtakingfilterOptionasNotEqualTo() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitLossReportwithtakingfilterOptionasNotEqualTo(), true);
	}
	
	 
	 
	//Balance Sheet
	
	
	
	 @Test(priority=348)
	public void checkBalanceSheetReportwithFilterOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBalanceSheetReportwithFilterOption(), true);
	}
	
	 
	 @Test(priority=349)
		public void checkBalanceSheetAnalyzeOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetAnalyzeOption(), true);
		}
		
		
		@Test(priority=350)
		public void checkBalanceSheetAnalyzeReportExportExcelOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportExportExcelOption(), true);
		}
		
		
		@Test(priority=351)
		public void checkBalanceSheetAnalyzeReportExportPDFOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportExportPDFOption(), true);
		}
		
		
		
		@Test(priority=352)
		public void checkBalanceSheetAnalyzeReportPrintOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportPrintOption(), true);
		}
		
		
		@Test(priority=353)
		public void checkBalanceSheetAnalyzeReportSaveOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportSaveOption(), true);
		}
		
	 //Customer Summary
	 
	 @Test(priority=354)
		public void checkCustomerAgeingSummaryReportwithFilterOptionincludeMontlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerAgeingSummaryReportwithFilterOptionincludeMontlyAgeingChkBox(), true);
		}
	 
	 
	 @Test(priority=355)
		public void checkCustomerAgeingSummaryReportwithFilterOptionasAccountWithoutIncludeMothlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerAgeingSummaryReportwithFilterOptionasAccountWithoutIncludeMothlyAgeingChkBox(), true);
		}
	 
	 
	 
	 
	 
	 @Test(priority=356)
		public void checkCustomerSummaryByDueDatewithFilterOptionincludeMonthlyAgeingChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerSummaryByDueDatewithFilterOptionincludeMonthlyAgeingChkBox(), true);
		}
	 
	
	 //Customer Summary at User Level
	 
	 @Test(priority=357)
	 public void checkLoginWithUserAllOptionsSTforCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 srp=new SanityFAReportsPage(getDriver());
		 Assert.assertEquals(srp.checkLoginWithUserAllOptionsST(), true);
	 }
	 
	 @Test(priority=358)
		public void checkCustomerAgeingSummaryReportwithFilterOptionincludeMontlyAgeingChkBoxWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerAgeingSummaryReportwithFilterOptionincludeMontlyAgeingChkBoxWithUserAllOptionsST(), true);
		}
	 
	 
	 @Test(priority=359)
		public void checkCustomerAgeingSummaryReportwithFilterOptionasAccountWithoutIncludeMothlyAgeingChkBoxWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerAgeingSummaryReportwithFilterOptionasAccountWithoutIncludeMothlyAgeingChkBoxWithUserAllOptionsST(), true);
		}
	  
	 
	 
	 @Test(priority=360)
		public void checkCustomerSummaryByDueDatewithFilterOptionincludeMonthlyAgeingChkBoxWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerSummaryByDueDatewithFilterOptionincludeMonthlyAgeingChkBoxWithUserAllOptionsST(), true);
		}
	 
	 
	
	 
	 
	 
	 ///customer statement adding group levels at customization
	 
	 
	
	
	 @Test(priority=361)
	public void checkCustomerStatementHeaderFieldsBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerStatementHeaderFieldsBeforeCustomization(), true);
	}
 
	
	
	 @Test(priority=362)
		public void checkCustomerStatementwithCustomizationLevelFieldsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerStatementwithCustomizationLevelFieldsReport(), true);
		}
	 
	 
	 @Test(priority=363)//getting exception message
		public void checkAddingLevelFieldsunderCustomization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkAddingLevelFieldsunderCustomization(), true);
		}
	
	 
	 
	 @Test(priority=364)
		public void checkCustomerStatementHeaderDetailsAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkCustomerStatementHeaderDetailsAfterCustomization(), true);
		}
	 
	 
	 ///Balance sheet and Profit/loss at User Level
	 
	 
	 @Test(priority=365)
	 public void checkLoginUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 srp=new SanityFAReportsPage(getDriver());
		 Assert.assertEquals(srp.checkLoginWithUserAllOptionsST(), true);
	 }
	 
		@Test(priority=366)
		public void checkProfitAndLossReportwithFilterOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitAndLossReportwithFilterOption(), true);
		}
		
		
		
		
		@Test(priority=367)
		public void checkProfitLossAnalyzeOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossAnalyzeOption(), true);
		}
		
		
		@Test(priority=368)
		public void checkProfitLossAnalyzeReportExportExcelOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossAnalyzeReportExportExcelOption(), true);
		}
		
		
		@Test(priority=369)
		public void checkProfitLossAnalyzeReportExportPDFOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossAnalyzeReportExportPDFOption(), true);
		}
		
		

		
		@Test(priority=370)
		public void checkProfitLossAnalyzeReportPrintOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossAnalyzeReportPrintOption(), true);
		}
		
		
		@Test(priority=371)
		public void checkProfitLossAnalyzeReportSaveOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossAnalyzeReportSaveOption(), true);
		}
		
		@Test(priority=372)
		public void checkProfitLossReportwithtakingfilterOptionasNotEqualToatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkProfitLossReportwithtakingfilterOptionasNotEqualTo(), true);
		}
		
		 
		 
		//Balance Sheet
		
		
		
		 @Test(priority=373)
		public void checkBalanceSheetReportwithFilterOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
		{
			srp=new SanityFAReportsPage(getDriver());
			Assert.assertEquals(srp.checkBalanceSheetReportwithFilterOption(), true);
		}
		
		 
		 @Test(priority=374)
			public void checkBalanceSheetAnalyzeOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkBalanceSheetAnalyzeOption(), true);
			}
			
			
			@Test(priority=375)
			public void checkBalanceSheetAnalyzeReportExportExcelOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportExportExcelOption(), true);
			}
			
			
			@Test(priority=376)
			public void checkBalanceSheetAnalyzeReportExportPDFOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportExportPDFOption(), true);
			}
			
			
			
			@Test(priority=377)
			public void checkBalanceSheetAnalyzeReportPrintOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportPrintOption(), true);
			}
			
			
			@Test(priority=378)
			public void checkBalanceSheetAnalyzeReportSaveOptionatUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkBalanceSheetAnalyzeReportSaveOption(), true);
			}
	 
			
			/////checking the Date Range Options in Financial Reports/////////////
			
			
			
	 
			
		//	@Test(priority=379)
			public void checkCurrentMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				srp.checkCurrentMonth();
			}
	 
			
			
			 @Test(priority=379)
			 public void checkLoginWithSUAgain() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
			 {
				 srp=new SanityFAReportsPage(getDriver());
				 Assert.assertEquals(srp.checkLoginWithSU(), true);
			 }
			
			
			
			
			@Test(priority=380)
			public void checkFinanacialLedgerReportwithDateRangeasCurrentMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasCurrentMonth(), true);
			}
			
			@Test(priority=381)
			public void checkFinanacialLedgerReportwithDateRangeasPreviousMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasPreviousMonth(), true);
			}
			
			@Test(priority=382)
			public void checkFinanacialLedgerReportwithDateRangeasCurrentWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasCurrentWeek(), true);
			}
			
			@Test(priority=383)
			public void checkFinanacialLedgerReportwithDateRangeasPreviousWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasPreviousWeek(), true);
			}
	
			
			@Test(priority=384)
			public void checkFinanacialLedgerReportwithDateRangeasToday() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasToday(), true);
			}
			
			
			@Test(priority=385)
			public void checkFinanacialLedgerReportwithDateRangeasCurrentYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasCurrentYear(), true);
			}
			
			@Test(priority=386)
			public void checkFinanacialLedgerReportwithDateRangeasPreviousYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasPreviousYear(), true);
			}
	
			@Test(priority=387)
			public void checkFinanacialLedgerReportwithDateRangeasCurrentFinancialYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasCurrentFinancialYear(), true);
			}
			
			@Test(priority=388)
			public void checkFinanacialLedgerReportwithDateRangeasYesterDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasYesterDay(), true);
			}
			
			
			
			@Test(priority=389)
			public void checkFinanacialLedgerReportwithDateRangeasCurrentQuarterYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasCurrentQuarterYear(), true);
			}
			
			@Test(priority=390)
			public void checkFinanacialLedgerReportwithDateRangeasPreviousQuarterYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkFinanacialLedgerReportwithDateRangeasPreviousQuarterYear(), true);
			}

			
	//Trail Balance		
			
			@Test(priority=391)
			public void checkTrailBalanceReportwithDateRangeasCurrentMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasCurrentMonth(), true);
			}

			@Test(priority=392)
			public void checkTrailBalanceReportwithDateRangeasPreviousMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasPreviousMonth(), true);
			}

			@Test(priority=393)
			public void checkTrailBalanceReportwithDateRangeasCurrentWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasCurrentWeek(), true);
			}

			@Test(priority=394)
			public void checkTrailBalanceReportwithDateRangeasPreviousWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasPreviousWeek(), true);
			}

			@Test(priority=395)
			public void checkTrailBalanceReportwithDateRangeasToday() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasToday(), true);
			}

			@Test(priority=396)
			public void checkTrailBalanceReportwithDateRangeasCurrentYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasCurrentYear(), true);
			}

			@Test(priority=397)
			public void checkTrailBalanceReportwithDateRangeasPreviousYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasPreviousYear(), true);
			}

			@Test(priority=398)
			public void checkTrailBalanceReportwithDateRangeasCurrentFinancialYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasCurrentFinancialYear(), true);
			}

			
			
			
			@Test(priority=399)
			public void checkTrailBalanceReportwithDateRangeasYesterDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasYesterDay(), true);
			}

			
			
			@Test(priority=400)
			public void checkTrailBalanceReportwithDateRangeasCurrentQuarterYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasCurrentQuarterYear(), true);
			}

			
			@Test(priority=401)
			public void checkTrailBalanceReportwithDateRangeasPreviousQuarterYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkTrailBalanceReportwithDateRangeasPreviousQuarterYear(), true);
			}

	//Customer statement		
			
			
			@Test(priority=402)
			public void checkCustomerStatementReportDateRangeasCurrentMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasCurrentMonth(), true);
			}
			
			@Test(priority=403)
			public void checkCustomerStatementReportDateRangeasPreviousMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasPreviousMonth(), true);
			}
			@Test(priority=404)
			public void checkCustomerStatementReportDateRangeasCurrentWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasCurrentWeek(), true);
			}
			@Test(priority=405)
			public void checkCustomerStatementReportDateRangeasPreviousWeek() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasPreviousWeek(), true);
			}
			@Test(priority=406)
			public void checkCustomerStatementReportDateRangeasToday() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasToday(), true);
			}
			@Test(priority=407)
			public void checkCustomerStatementReportDateRangeasCurrentYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasCurrentYear(), true);
			}
			@Test(priority=408)
			public void checkCustomerStatementReportDateRangeasPreviousYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasPreviousYear(), true);
			}
			@Test(priority=409)
			public void checkCustomerStatementReportDateRangeasCurrentFinancialYear() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasCurrentFinancialYear(), true);
			}
			
			@Test(priority=410)
			public void checkCustomerStatementReportDateRangeasYesterDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasYesterDay(), true);
			}
			
			
			@Test(priority=411)
			public void checkCustomerStatementReportDateRangeasCurrentQuarter() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasCurrentQuarter(), true);
			}
			
			
			@Test(priority=412)
			public void checkCustomerStatementReportDateRangeasPreviousQuarter() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
			{
				srp=new SanityFAReportsPage(getDriver());
				Assert.assertEquals(srp.checkCustomerStatementReportDateRangeasPreviousQuarter(), true);
			}
			
				
		/////////////////////Checking all checkboxes in Ledger/////////////////	
	
			
	@Test(priority=413)
	public void checkFinancialLedgerWithMovedAccountOnlyChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerWithMovedAccountOnlyChkBox(), true);
	}
	
	
	@Test(priority=414)
	public void checkFinancialLedgerWithPrintAccountIndexChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerWithPrintAccountIndexChkBox(), true);
	}
	
	
	@Test(priority=415)
	public void checkFinancialLedgerFreshPageforEachAccountChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerFreshPageforEachAccountChkBox(), true);
	}
	
	@Test(priority=416)
	public void checkFinancialLedgerPrintasStatementofAccountChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerPrintasStatementofAccountChkBox(), true);
	}
	
	
	
	@Test(priority=417)
	public void checkFinancialLedgerDisplayUnrelizedProfitLossChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerDisplayUnrelizedProfitLossChkBox(), true);
	}
	
	
	
	
	@Test(priority=418)
	public void checkFinancialLedgerIgnoreConvertedPDCChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerIgnoreConvertedPDCChkBox(), true);
	}
	
	
	
	
	@Test(priority=419)
	public void checkFinancialLedgerDisplayMaturedPDCChkBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerDisplayMaturedPDCChkBox(), true);
	}
	
	
	@Test(priority=420)
	public void checkFinancialLedgerOutputDropdownwithPrinterasOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerOutputDropdownwithPrinterasOption(), true);
	}
	
	
	
	
	@Test(priority=421)
	public void checkFinancialLedgerOutputDropdownasPrintDraftModeOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerOutputDropdownasPrintDraftModeOption(), true);
	}
	
	
	
	@Test(priority=422)
	public void ckeckFinancialLedgerOutputDropdownwithExcelSheetOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.ckeckFinancialLedgerOutputDropdownwithExcelSheetOption(), true);
	}
	
	
	
	@Test(priority=423)
	public void ckeckFinancialLedgerOutputDropdownwithExcelCSVOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.ckeckFinancialLedgerOutputDropdownwithExcelCSVOption(), true);
	}
	
	
	
	@Test(priority=424)
	public void checkFinancialLedgerOutputDropdownasFilePathOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerOutputDropdownasFilePathOption(), true);
	}
	
	
	@Test(priority=425)
	public void checkFinancialLedgerOutputDropdownasEmailOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		srp=new SanityFAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinancialLedgerOutputDropdownasEmailOption(), true);
	}
	
	
	
	
}
			*/