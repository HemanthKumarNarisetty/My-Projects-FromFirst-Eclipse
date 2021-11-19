package com.orangehrm.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.gererics.Base;
import com.orangehrm.gererics.Filelib;
import com.orangehrm.gererics.Webdriverwait;
import com.orangehrm.pom.Recruitment_Candidates;
import com.orangehrm.pom.Recruitment_Candidates_Addcandidate;
@Listeners
public class TestCreateCandidate extends Base{

	@Test
	public void candidateCreation() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
	{
		/*
		 * For Adding  the candidate 
		 */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Recruitment_Candidates rc1=new Recruitment_Candidates(driver);
		rc1.recruitment(driver);
		rc1.candidates();
		rc1.AddBTN();
		Recruitment_Candidates_Addcandidate rc=new Recruitment_Candidates_Addcandidate(driver);
		String first=Filelib.readExcelData(1, 2);
		Reporter.log(first,true);
		rc.firstname(first);
		String middle = Filelib.readExcelData(1, 3);
		rc.middleName(middle);
		String last = Filelib.readExcelData(1,4);
		rc.lastName(last);
		String email = Filelib.readExcelData(1,5);
		rc.email(email);
		String contact=Filelib.readExcelData(1,6);
		rc.contactno(contact);
		rc.select_JobVacanyItem();
		String resume=Filelib.readExcelData(1, 9);
		rc.resume_upload(resume);
		rc.Date_of_Application();
		rc.Select_Year();
		rc.Select_month();
		rc.select_Date();
		Webdriverwait w=new Webdriverwait();
		w.visibilityElement(driver,rc.savebutton());
		rc.save();
		rc1.candidates();
	
//		/*
//		 * For getting the created candidate in the list of candidates 
//		 */
//		//Retrieving Candidate name from excel
		String created_Candidate=Filelib.readExcelData(4, 0);
		//Passing candidate name to the Candidate Name field
		rc1.enterCandidatename(created_Candidate);
		//selecting vacancy
		rc1.Vacancy();
		//Selecting the From date
		rc1.fromdate();
		//clicking search button
		rc1.search();
		//Getting the searched candidate name
		String searched_Candidate=rc1.searched_candidate_from_list();
		Filelib.write_DataInExcel(5, 0, searched_Candidate);
		//Comparing the created candidate name and in list candidate
		Assert.assertEquals(searched_Candidate, created_Candidate);
		
	}
	
}
